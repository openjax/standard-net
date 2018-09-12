/* Copyright (c) 2017 lib4j
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.lib4j.net;

import java.util.Collection;

import org.fastjax.util.Collections;

public class Service {
  /** Official service name */
  private final String serviceName;
  /** TCP or UDP port number */
  private final int port;

  /** All the aliases for this service */
  private final Collection<String> aliases;

  protected Service(final String serviceName, final int port, final Collection<String> aliases) {
    this.serviceName = serviceName;
    this.port = port;
    this.aliases = aliases;
  }

  public String getName() {
    return this.serviceName;
  }

  public int getPort() {
    return this.port;
  }

  public Collection<String> getAliases() {
    return this.aliases;
  }

  @Override
  public String toString() {
    final String alias = Collections.toString(aliases, "\", \"");
    return "{\n  name: \"" + serviceName + "\",\n  port: " + port + ",\n  aliases: [" + (alias.length() > 0 ? "\"" + alias + "\"" : "") + "]\n}";
  }
}