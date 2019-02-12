/*
 * Copyright (c) 2019 Spotify AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.spotify.folsom;

import java.util.List;

public interface Resolver {

  class ResolveResult {
    private final String host;
    private final int port;
    private final long ttl;

    public ResolveResult(String host, int port, long ttl) {
      this.host = host;
      this.port = port;
      this.ttl = ttl;
    }

    public String getHost() {
      return host;
    }

    public int getPort() {
      return port;
    }

    public long getTtl() {
      return ttl;
    }
  }

  List<ResolveResult> resolve();
}