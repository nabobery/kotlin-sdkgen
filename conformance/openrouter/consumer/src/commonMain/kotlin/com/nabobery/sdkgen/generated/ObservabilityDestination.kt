package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class ObservabilityDestinationDecodingException(
  message: String,
) : SerializationException(message)

public class ObservabilityDestinationNoMatchException(
  message: String,
) : ObservabilityDestinationDecodingException(message)

public class ObservabilityDestinationAmbiguityException(
  message: String,
) : ObservabilityDestinationDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDestination.
 */
@Serializable(with = ObservabilityDestination.Serializer::class)
public sealed interface ObservabilityDestination {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ObservabilityArizeDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityArizeDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityArizeDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityArizeDestination = ObservabilityArizeDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "arize")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityBraintrustDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityBraintrustDestination = ObservabilityBraintrustDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "braintrust")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityClickhouseDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityClickhouseDestination = ObservabilityClickhouseDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "clickhouse")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityDatadogDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityDatadogDestination = ObservabilityDatadogDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "datadog")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityGrafanaDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityGrafanaDestination = ObservabilityGrafanaDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "grafana")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityLangfuseDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityLangfuseDestination = ObservabilityLangfuseDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "langfuse")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityLangsmithDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityLangsmithDestination = ObservabilityLangsmithDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "langsmith")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityNewrelicDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityNewrelicDestination = ObservabilityNewrelicDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "newrelic")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityOpikDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityOpikDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityOpikDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityOpikDestination = ObservabilityOpikDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "opik")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityOtelCollectorDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityOtelCollectorDestination = ObservabilityOtelCollectorDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "otel-collector")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityPosthogDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityPosthogDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityPosthogDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityPosthogDestination = ObservabilityPosthogDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "posthog")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityRampDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityRampDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityRampDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityRampDestination = ObservabilityRampDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "ramp")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityS3Destination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityS3DestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityS3DestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityS3Destination = ObservabilityS3Destination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "s3")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilitySentryDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilitySentryDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilitySentryDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilitySentryDestination = ObservabilitySentryDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "sentry")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilitySnowflakeDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilitySnowflakeDestination = ObservabilitySnowflakeDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "snowflake")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityWeaveDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityWeaveDestination = ObservabilityWeaveDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "weave")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public class ObservabilityWebhookDestination internal constructor(
    public val apiKeyHashes: List<String>?,
    public val config: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfig,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfig,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityWebhookDestination = ObservabilityWebhookDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
        raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashes))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", "webhook")
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        },
      )
    }
  }

  public object Serializer : KSerializer<ObservabilityDestination> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ObservabilityDestination {
      val jsonDecoder = decoder.requireJsonDecoder("ObservabilityDestination")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: expected JSON " +
          "object")
      val matches = inspectObservabilityDestination(raw)
      if (matches.size == 0) {
        throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + matches
          .failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState1Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityArizeDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState1), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState1), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState2Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState2Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityBraintrustDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState2), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState2), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState3Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState3Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityClickhouseDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState3), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState3), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState4Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState4Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityDatadogDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState4), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState4), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState5Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState5Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityGrafanaDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState5), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState5), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState6Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState6Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityLangfuseDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState6), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState6), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState7Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState7Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityLangsmithDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState7), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState7), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState8Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState8Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityNewrelicDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState8), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState8), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState9Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState9Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityOpikDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState9), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState9), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState10Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState10Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityOtelCollectorDestination(apiKeyHashes = matches.apiKeyHashes,
                  config = requireNotNull(matches.configState10), createdAt = requireNotNull(matches.createdAt),
                    enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id =
                      requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches
                        .privacyMode), samplingRate = requireNotNull(matches.samplingRate), type =
                          requireNotNull(matches.typeState10), updatedAt = requireNotNull(matches.updatedAt),
                            workspaceId = requireNotNull(matches.workspaceId), raw = raw)
        matches.typeState11Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState11Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityPosthogDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState11), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState11), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState12Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState12Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityRampDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState12), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState12), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState13Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState13Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityS3Destination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState13), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState13), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState14Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState14Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilitySentryDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState14), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState14), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState15Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState15Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilitySnowflakeDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState15), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState15), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState16Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState16Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityWeaveDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState16), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState16), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        matches.typeState17Matches && matches.apiKeyHashesPresent && matches.apiKeyHashesDecoded && matches
          .configState17Decoded && matches.createdAtDecoded && matches.enabledDecoded && matches.filterRulesPresent &&
            matches.filterRulesDecoded && matches.idDecoded && matches.namePresent && matches.nameDecoded && matches
              .privacyModeDecoded && matches.samplingRateDecoded && matches.updatedAtDecoded && matches
                .workspaceIdDecoded -> ObservabilityWebhookDestination(apiKeyHashes = matches.apiKeyHashes, config =
                  requireNotNull(matches.configState17), createdAt = requireNotNull(matches.createdAt), enabled =
                    requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches
                      .id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate =
                        requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState17), updatedAt =
                          requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw =
                            raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: ObservabilityDestination) {
      encoder.requireJsonEncoder("ObservabilityDestination").encodeJsonElement(value.raw)
    }
  }
}

private data class ObservabilityDestinationInspection(
  public val typeState1: InlineComponentsSchemasObservabilityArizeDestinationPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val apiKeyHashes: List<String>?,
  public val apiKeyHashesPresent: Boolean,
  public val apiKeyHashesDecoded: Boolean,
  public val configState1: InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig?,
  public val configState1Decoded: Boolean,
  public val createdAt: String?,
  public val createdAtDecoded: Boolean,
  public val enabled: Boolean?,
  public val enabledDecoded: Boolean,
  public val filterRules: ObservabilityFilterRulesConfig?,
  public val filterRulesPresent: Boolean,
  public val filterRulesDecoded: Boolean,
  public val id: String?,
  public val idDecoded: Boolean,
  public val name: String?,
  public val namePresent: Boolean,
  public val nameDecoded: Boolean,
  public val privacyMode: Boolean?,
  public val privacyModeDecoded: Boolean,
  public val samplingRate: Double?,
  public val samplingRateDecoded: Boolean,
  public val updatedAt: String?,
  public val updatedAtDecoded: Boolean,
  public val workspaceId: String?,
  public val workspaceIdDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val configState2:
      InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig?,
  public val configState2Decoded: Boolean,
  public val typeState3: InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val configState3:
      InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig?,
  public val configState3Decoded: Boolean,
  public val typeState4: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val configState4: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig?,
  public val configState4Decoded: Boolean,
  public val typeState5: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val configState5: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig?,
  public val configState5Decoded: Boolean,
  public val typeState6: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val configState6: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig?,
  public val configState6Decoded: Boolean,
  public val typeState7: InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val configState7:
      InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesConfig?,
  public val configState7Decoded: Boolean,
  public val typeState8: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val configState8: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig?,
  public val configState8Decoded: Boolean,
  public val typeState9: InlineComponentsSchemasObservabilityOpikDestinationPropertiesType?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val configState9: InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig?,
  public val configState9Decoded: Boolean,
  public val typeState10:
      InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val configState10:
      InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig?,
  public val configState10Decoded: Boolean,
  public val typeState11: InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val configState11: InlineComponentsSchemasObservabilityPosthogDestinationPropertiesConfig?,
  public val configState11Decoded: Boolean,
  public val typeState12: InlineComponentsSchemasObservabilityRampDestinationPropertiesType?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val configState12: InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig?,
  public val configState12Decoded: Boolean,
  public val typeState13: InlineComponentsSchemasObservabilityS3DestinationPropertiesType?,
  public val typeState13Decoded: Boolean,
  public val typeState13Matches: Boolean,
  public val configState13: InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig?,
  public val configState13Decoded: Boolean,
  public val typeState14: InlineComponentsSchemasObservabilitySentryDestinationPropertiesType?,
  public val typeState14Decoded: Boolean,
  public val typeState14Matches: Boolean,
  public val configState14: InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig?,
  public val configState14Decoded: Boolean,
  public val typeState15: InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType?,
  public val typeState15Decoded: Boolean,
  public val typeState15Matches: Boolean,
  public val configState15:
      InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig?,
  public val configState15Decoded: Boolean,
  public val typeState16: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType?,
  public val typeState16Decoded: Boolean,
  public val typeState16Matches: Boolean,
  public val configState16: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig?,
  public val configState16Decoded: Boolean,
  public val typeState17: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType?,
  public val typeState17Decoded: Boolean,
  public val typeState17Matches: Boolean,
  public val configState17: InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfig?,
  public val configState17Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState1Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityArizeDestination")
      if (typeState2Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState2Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityBraintrustDestination")
      if (typeState3Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState3Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityClickhouseDestination")
      if (typeState4Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState4Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityDatadogDestination")
      if (typeState5Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState5Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityGrafanaDestination")
      if (typeState6Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState6Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityLangfuseDestination")
      if (typeState7Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState7Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityLangsmithDestination")
      if (typeState8Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState8Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityNewrelicDestination")
      if (typeState9Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState9Decoded && createdAtDecoded &&
        enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent && nameDecoded &&
          privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityOpikDestination")
      if (typeState10Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState10Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityOtelCollectorDestination")
      if (typeState11Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState11Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityPosthogDestination")
      if (typeState12Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState12Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityRampDestination")
      if (typeState13Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState13Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityS3Destination")
      if (typeState14Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState14Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilitySentryDestination")
      if (typeState15Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState15Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilitySnowflakeDestination")
      if (typeState16Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState16Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityWeaveDestination")
      if (typeState17Matches && apiKeyHashesPresent && apiKeyHashesDecoded && configState17Decoded &&
        createdAtDecoded && enabledDecoded && filterRulesPresent && filterRulesDecoded && idDecoded && namePresent &&
          nameDecoded && privacyModeDecoded && samplingRateDecoded && updatedAtDecoded &&
            workspaceIdDecoded) add("ObservabilityWebhookDestination")
    }

  public val size: Int
    get() = names.size
}

private fun inspectObservabilityDestination(raw: JsonObject): ObservabilityDestinationInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityArizeDestinationPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "arize" && typeState1Decoded
  val apiKeyHashesResult = raw["api_key_hashes"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<String>?>(element) } }
  val apiKeyHashes = apiKeyHashesResult?.getOrNull()
  val apiKeyHashesPresent = raw.containsKey("api_key_hashes")
  val apiKeyHashesDecoded = apiKeyHashesResult?.isSuccess == true
  val configState1Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityArizeDestinationPropertiesConfig>(element) } }
  val configState1 = configState1Result?.getOrNull()
  val configState1Decoded = configState1Result?.isSuccess == true
  val createdAtResult = raw["created_at"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val createdAt = createdAtResult?.getOrNull()
  val createdAtDecoded = createdAtResult?.isSuccess == true
  val enabledResult = raw["enabled"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Boolean>(element) } }
  val enabled = enabledResult?.getOrNull()
  val enabledDecoded = enabledResult?.isSuccess == true
  val filterRulesResult = raw["filter_rules"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<ObservabilityFilterRulesConfig?>(element) } }
  val filterRules = filterRulesResult?.getOrNull()
  val filterRulesPresent = raw.containsKey("filter_rules")
  val filterRulesDecoded = filterRulesResult?.isSuccess == true
  val idResult = raw["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val nameResult = raw["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val name = nameResult?.getOrNull()
  val namePresent = raw.containsKey("name")
  val nameDecoded = nameResult?.isSuccess == true
  val privacyModeResult = raw["privacy_mode"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Boolean>(element) } }
  val privacyMode = privacyModeResult?.getOrNull()
  val privacyModeDecoded = privacyModeResult?.isSuccess == true
  val samplingRateResult = raw["sampling_rate"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Double>(element) } }
  val samplingRate = samplingRateResult?.getOrNull()
  val samplingRateDecoded = samplingRateResult?.isSuccess == true
  val updatedAtResult = raw["updated_at"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val updatedAt = updatedAtResult?.getOrNull()
  val updatedAtDecoded = updatedAtResult?.isSuccess == true
  val workspaceIdResult = raw["workspace_id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val workspaceId = workspaceIdResult?.getOrNull()
  val workspaceIdDecoded = workspaceIdResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "braintrust" && typeState2Decoded
  val configState2Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesConfig>(element) } }
  val configState2 = configState2Result?.getOrNull()
  val configState2Decoded = configState2Result?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "clickhouse" && typeState3Decoded
  val configState3Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityClickhouseDestinationPropertiesConfig>(element) } }
  val configState3 = configState3Result?.getOrNull()
  val configState3Decoded = configState3Result?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "datadog" && typeState4Decoded
  val configState4Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityDatadogDestinationPropertiesConfig>(element) } }
  val configState4 = configState4Result?.getOrNull()
  val configState4Decoded = configState4Result?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = raw.stringValue("type") == "grafana" && typeState5Decoded
  val configState5Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesConfig>(element) } }
  val configState5 = configState5Result?.getOrNull()
  val configState5Decoded = configState5Result?.isSuccess == true
  val typeState6Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = raw.stringValue("type") == "langfuse" && typeState6Decoded
  val configState6Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesConfig>(element) } }
  val configState6 = configState6Result?.getOrNull()
  val configState6Decoded = configState6Result?.isSuccess == true
  val typeState7Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = raw.stringValue("type") == "langsmith" && typeState7Decoded
  val configState7Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesConfig>(element) } }
  val configState7 = configState7Result?.getOrNull()
  val configState7Decoded = configState7Result?.isSuccess == true
  val typeState8Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesType>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = raw.stringValue("type") == "newrelic" && typeState8Decoded
  val configState8Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfig>(element) } }
  val configState8 = configState8Result?.getOrNull()
  val configState8Decoded = configState8Result?.isSuccess == true
  val typeState9Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityOpikDestinationPropertiesType>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = raw.stringValue("type") == "opik" && typeState9Decoded
  val configState9Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityOpikDestinationPropertiesConfig>(element) } }
  val configState9 = configState9Result?.getOrNull()
  val configState9Decoded = configState9Result?.isSuccess == true
  val typeState10Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = raw.stringValue("type") == "otel-collector" && typeState10Decoded
  val configState10Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesConfig>(element) } }
  val configState10 = configState10Result?.getOrNull()
  val configState10Decoded = configState10Result?.isSuccess == true
  val typeState11Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = raw.stringValue("type") == "posthog" && typeState11Decoded
  val configState11Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityPosthogDestinationPropertiesConfig>(element) } }
  val configState11 = configState11Result?.getOrNull()
  val configState11Decoded = configState11Result?.isSuccess == true
  val typeState12Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityRampDestinationPropertiesType>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = raw.stringValue("type") == "ramp" && typeState12Decoded
  val configState12Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityRampDestinationPropertiesConfig>(element) } }
  val configState12 = configState12Result?.getOrNull()
  val configState12Decoded = configState12Result?.isSuccess == true
  val typeState13Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityS3DestinationPropertiesType>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = raw.stringValue("type") == "s3" && typeState13Decoded
  val configState13Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig>(element) } }
  val configState13 = configState13Result?.getOrNull()
  val configState13Decoded = configState13Result?.isSuccess == true
  val typeState14Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilitySentryDestinationPropertiesType>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = raw.stringValue("type") == "sentry" && typeState14Decoded
  val configState14Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilitySentryDestinationPropertiesConfig>(element) } }
  val configState14 = configState14Result?.getOrNull()
  val configState14Decoded = configState14Result?.isSuccess == true
  val typeState15Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesType>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = raw.stringValue("type") == "snowflake" && typeState15Decoded
  val configState15Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilitySnowflakeDestinationPropertiesConfig>(element) } }
  val configState15 = configState15Result?.getOrNull()
  val configState15Decoded = configState15Result?.isSuccess == true
  val typeState16Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = raw.stringValue("type") == "weave" && typeState16Decoded
  val configState16Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityWeaveDestinationPropertiesConfig>(element) } }
  val configState16 = configState16Result?.getOrNull()
  val configState16Decoded = configState16Result?.isSuccess == true
  val typeState17Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityWebhookDestinationPropertiesType>(element) } }
  val typeState17 = typeState17Result?.getOrNull()
  val typeState17Decoded = typeState17Result?.isSuccess == true
  val typeState17Matches = raw.stringValue("type") == "webhook" && typeState17Decoded
  val configState17Result = raw["config"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasObservabilityWebhookDestinationPropertiesConfig>(element) } }
  val configState17 = configState17Result?.getOrNull()
  val configState17Decoded = configState17Result?.isSuccess == true
  return ObservabilityDestinationInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    apiKeyHashes = apiKeyHashes,
    apiKeyHashesPresent = apiKeyHashesPresent,
    apiKeyHashesDecoded = apiKeyHashesDecoded,
    configState1 = configState1,
    configState1Decoded = configState1Decoded,
    createdAt = createdAt,
    createdAtDecoded = createdAtDecoded,
    enabled = enabled,
    enabledDecoded = enabledDecoded,
    filterRules = filterRules,
    filterRulesPresent = filterRulesPresent,
    filterRulesDecoded = filterRulesDecoded,
    id = id,
    idDecoded = idDecoded,
    name = name,
    namePresent = namePresent,
    nameDecoded = nameDecoded,
    privacyMode = privacyMode,
    privacyModeDecoded = privacyModeDecoded,
    samplingRate = samplingRate,
    samplingRateDecoded = samplingRateDecoded,
    updatedAt = updatedAt,
    updatedAtDecoded = updatedAtDecoded,
    workspaceId = workspaceId,
    workspaceIdDecoded = workspaceIdDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    configState2 = configState2,
    configState2Decoded = configState2Decoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    configState3 = configState3,
    configState3Decoded = configState3Decoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    configState4 = configState4,
    configState4Decoded = configState4Decoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    configState5 = configState5,
    configState5Decoded = configState5Decoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    configState6 = configState6,
    configState6Decoded = configState6Decoded,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    configState7 = configState7,
    configState7Decoded = configState7Decoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    configState8 = configState8,
    configState8Decoded = configState8Decoded,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    configState9 = configState9,
    configState9Decoded = configState9Decoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    configState10 = configState10,
    configState10Decoded = configState10Decoded,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    configState11 = configState11,
    configState11Decoded = configState11Decoded,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    configState12 = configState12,
    configState12Decoded = configState12Decoded,
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState13Matches = typeState13Matches,
    configState13 = configState13,
    configState13Decoded = configState13Decoded,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState14Matches = typeState14Matches,
    configState14 = configState14,
    configState14Decoded = configState14Decoded,
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState15Matches = typeState15Matches,
    configState15 = configState15,
    configState15Decoded = configState15Decoded,
    typeState16 = typeState16,
    typeState16Decoded = typeState16Decoded,
    typeState16Matches = typeState16Matches,
    configState16 = configState16,
    configState16Decoded = configState16Decoded,
    typeState17 = typeState17,
    typeState17Decoded = typeState17Decoded,
    typeState17Matches = typeState17Matches,
    configState17 = configState17,
    configState17Decoded = configState17Decoded,
    failures = buildList {
      if (!typeState1Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState1Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityArizeDestination: required properties 'type' and 'api_key_hashes' " +
              "and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' and 'privacy_mode' " +
              "and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared types")
      if (!typeState2Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState2Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityBraintrustDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState3Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState3Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityClickhouseDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState4Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState4Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityDatadogDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState5Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState5Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityGrafanaDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState6Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState6Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityLangfuseDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState7Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState7Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityLangsmithDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState8Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState8Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityNewrelicDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState9Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState9Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityOpikDestination: required properties 'type' and 'api_key_hashes' " +
              "and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' and 'privacy_mode' " +
              "and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared types")
      if (!typeState10Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState10Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityOtelCollectorDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState11Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState11Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityPosthogDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState12Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState12Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityRampDestination: required properties 'type' and 'api_key_hashes' " +
              "and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' and 'privacy_mode' " +
              "and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared types")
      if (!typeState13Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState13Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityS3Destination: required properties 'type' and 'api_key_hashes' and " +
              "'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' and 'privacy_mode' and " +
              "'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared types")
      if (!typeState14Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState14Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilitySentryDestination: required properties 'type' and 'api_key_hashes' " +
              "and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' and 'privacy_mode' " +
              "and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared types")
      if (!typeState15Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState15Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilitySnowflakeDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
      if (!typeState16Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState16Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityWeaveDestination: required properties 'type' and 'api_key_hashes' " +
              "and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' and 'privacy_mode' " +
              "and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared types")
      if (!typeState17Matches || !apiKeyHashesPresent || !apiKeyHashesDecoded || !configState17Decoded ||
        !createdAtDecoded || !enabledDecoded || !filterRulesPresent || !filterRulesDecoded || !idDecoded ||
          !namePresent || !nameDecoded || !privacyModeDecoded || !samplingRateDecoded || !updatedAtDecoded ||
            !workspaceIdDecoded) add("ObservabilityWebhookDestination: required properties 'type' and " +
              "'api_key_hashes' and 'config' and 'created_at' and 'enabled' and 'filter_rules' and 'id' and 'name' " +
              "and 'privacy_mode' and 'sampling_rate' and 'updated_at' and 'workspace_id' do not match their declared " +
              "types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
