package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
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

public class ObservabilityDestinationBranchValidationException(
  message: String,
) : ObservabilityDestinationDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDestination.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDestination
 */
@Serializable(with = ObservabilityDestinationSerializer::class)
public sealed interface ObservabilityDestination {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ObservabilityArizeDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityArizeDestinationConfigXfbccede6,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityArizeDestinationTypeXaa945fac,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityArizeDestinationConfigXfbccede6,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityArizeDestinationTypeXaa945fac,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityArizeDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityArizeDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityArizeDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityArizeDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityBraintrustDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityBraintrustDestinationConfigXca3254f1,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityBraintrustDestinationTypeXdc9ebcbd,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityBraintrustDestinationConfigXca3254f1,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityBraintrustDestinationTypeXdc9ebcbd,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityBraintrustDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityBraintrustDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityBraintrustDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityBraintrustDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityClickhouseDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityClickhouseDestinationConfigXc10e4bca,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityClickhouseDestinationTypeXab25c58f,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityClickhouseDestinationConfigXc10e4bca,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityClickhouseDestinationTypeXab25c58f,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityClickhouseDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityClickhouseDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityClickhouseDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityClickhouseDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityDatadogDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityDatadogDestinationConfigX54fdef51,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityDatadogDestinationTypeXaafd1c26,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityDatadogDestinationConfigX54fdef51,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityDatadogDestinationTypeXaafd1c26,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityDatadogDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityDatadogDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityDatadogDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityDatadogDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityGrafanaDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityGrafanaDestinationConfigXfba37ac5,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityGrafanaDestinationTypeXc4e6d71b,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityGrafanaDestinationConfigXfba37ac5,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityGrafanaDestinationTypeXc4e6d71b,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityGrafanaDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityGrafanaDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityGrafanaDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityGrafanaDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityLangfuseDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityLangfuseDestinationConfigX61477ff1,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityLangfuseDestinationTypeXd56f0579,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityLangfuseDestinationConfigX61477ff1,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityLangfuseDestinationTypeXd56f0579,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityLangfuseDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityLangfuseDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityLangfuseDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityLangfuseDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityLangsmithDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityLangsmithDestinationConfigX8b295aef,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityLangsmithDestinationTypeX509d5017,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityLangsmithDestinationConfigX8b295aef,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityLangsmithDestinationTypeX509d5017,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityLangsmithDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityLangsmithDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityLangsmithDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityLangsmithDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityNewrelicDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityNewrelicDestinationConfigX9a13614a,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityNewrelicDestinationTypeX5f5ea9f0,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityNewrelicDestinationConfigX9a13614a,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityNewrelicDestinationTypeX5f5ea9f0,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityNewrelicDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityNewrelicDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityNewrelicDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityNewrelicDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityOpikDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityOpikDestinationConfigX2c5bed62,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityOpikDestinationTypeXf88b0504,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityOpikDestinationConfigX2c5bed62,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityOpikDestinationTypeXf88b0504,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityOpikDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityOpikDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityOpikDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityOpikDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityOtelCollectorDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityOtelCollectorDestinationConfigX25371089,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityOtelCollectorDestinationTypeX374fb456,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityOtelCollectorDestinationConfigX25371089,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityOtelCollectorDestinationTypeX374fb456,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityOtelCollectorDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityOtelCollectorDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityOtelCollectorDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityOtelCollectorDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityPosthogDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityPosthogDestinationConfigX67c98908,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityPosthogDestinationTypeXecda09da,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityPosthogDestinationConfigX67c98908,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityPosthogDestinationTypeXecda09da,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityPosthogDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityPosthogDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityPosthogDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityPosthogDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityRampDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityRampDestinationConfigX6c5677e2,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityRampDestinationTypeX477e9e28,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityRampDestinationConfigX6c5677e2,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityRampDestinationTypeX477e9e28,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityRampDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityRampDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityRampDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityRampDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityS3Destination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityS3DestinationConfigX48a00451,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityS3DestinationTypeX9c0c7555,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityS3DestinationConfigX48a00451,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityS3DestinationTypeX9c0c7555,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityS3Destination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityS3DestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityS3Destination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityS3Destination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilitySentryDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilitySentryDestinationConfigX9f3ba772,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilitySentryDestinationTypeX111ec570,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilitySentryDestinationConfigX9f3ba772,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilitySentryDestinationTypeX111ec570,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilitySentryDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilitySentryDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilitySentryDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilitySentryDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilitySnowflakeDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilitySnowflakeDestinationConfigXd7bd4928,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilitySnowflakeDestinationTypeXddfe0d50,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilitySnowflakeDestinationConfigXd7bd4928,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilitySnowflakeDestinationTypeXddfe0d50,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilitySnowflakeDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilitySnowflakeDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilitySnowflakeDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilitySnowflakeDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityWeaveDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityWeaveDestinationConfigX6fab4547,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityWeaveDestinationTypeX7ef86b2d,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityWeaveDestinationConfigX6fab4547,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityWeaveDestinationTypeX7ef86b2d,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityWeaveDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityWeaveDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityWeaveDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityWeaveDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }

  public class ObservabilityWebhookDestination internal constructor(
    apiKeyHashes: List<String>?,
    public val config: InlineObservabilityWebhookDestinationConfigXbcd5a650,
    public val createdAt: String,
    public val enabled: Boolean,
    public val filterRules: ObservabilityFilterRulesConfig?,
    public val id: String,
    public val name: String?,
    public val privacyMode: Boolean,
    public val samplingRate: Double,
    public val type: InlineObservabilityWebhookDestinationTypeX8453f751,
    public val updatedAt: String,
    public val workspaceId: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : ObservabilityDestination {
    public val apiKeyHashes: List<String>? =
        apiKeyHashes?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        apiKeyHashes: List<String>?,
        config: InlineObservabilityWebhookDestinationConfigXbcd5a650,
        createdAt: String,
        enabled: Boolean,
        filterRules: ObservabilityFilterRulesConfig?,
        id: String,
        name: String?,
        privacyMode: Boolean,
        samplingRate: Double,
        type: InlineObservabilityWebhookDestinationTypeX8453f751,
        updatedAt: String,
        workspaceId: String,
      ): ObservabilityWebhookDestination {
        val apiKeyHashesOwnershipSnapshot = apiKeyHashes?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("api_key_hashes", SdkJson.encodeToJsonElement(apiKeyHashesOwnershipSnapshot))
          put("config", SdkJson.encodeToJsonElement(config))
          put("created_at", createdAt)
          put("enabled", SdkJson.encodeToJsonElement(enabled))
          put("filter_rules", SdkJson.encodeToJsonElement(filterRules))
          put("id", id)
          put("name", name)
          put("privacy_mode", SdkJson.encodeToJsonElement(privacyMode))
          put("sampling_rate", SdkJson.encodeToJsonElement(samplingRate))
          put("type", SdkJson.encodeToJsonElement(type))
          put("updated_at", updatedAt)
          put("workspace_id", workspaceId)
        }
        val inspection = inspectObservabilityDestination(raw)
        if (inspection.size == 0) {
          throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.observabilityWebhookDestinationMatches) {
          throw ObservabilityDestinationBranchValidationException("ObservabilityWebhookDestination factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ObservabilityWebhookDestination(
          apiKeyHashes = apiKeyHashesOwnershipSnapshot,
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
          raw = raw,
        )
      }
    }
  }
}

internal object ObservabilityDestinationSerializer : KSerializer<ObservabilityDestination> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): ObservabilityDestination {
    val jsonDecoder = decoder.requireJsonDecoder("ObservabilityDestination")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: expected JSON object")
    val matches = inspectObservabilityDestination(rawObject)
    if (matches.size == 0) {
      throw ObservabilityDestinationNoMatchException("ObservabilityDestination matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw ObservabilityDestinationAmbiguityException("ObservabilityDestination matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.observabilityArizeDestinationMatches -> ObservabilityDestination.ObservabilityArizeDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState1), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState1), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityBraintrustDestinationMatches -> ObservabilityDestination.ObservabilityBraintrustDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState2), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState3), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityClickhouseDestinationMatches -> ObservabilityDestination.ObservabilityClickhouseDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState3), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState5), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityDatadogDestinationMatches -> ObservabilityDestination.ObservabilityDatadogDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState4), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState7), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityGrafanaDestinationMatches -> ObservabilityDestination.ObservabilityGrafanaDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState5), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState9), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityLangfuseDestinationMatches -> ObservabilityDestination.ObservabilityLangfuseDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState6), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState11), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityLangsmithDestinationMatches -> ObservabilityDestination.ObservabilityLangsmithDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState7), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState13), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityNewrelicDestinationMatches -> ObservabilityDestination.ObservabilityNewrelicDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState8), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState15), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityOpikDestinationMatches -> ObservabilityDestination.ObservabilityOpikDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState9), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState17), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityOtelCollectorDestinationMatches -> ObservabilityDestination.ObservabilityOtelCollectorDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState10), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState19), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityPosthogDestinationMatches -> ObservabilityDestination.ObservabilityPosthogDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState11), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState21), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityRampDestinationMatches -> ObservabilityDestination.ObservabilityRampDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState12), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState23), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityS3DestinationMatches -> ObservabilityDestination.ObservabilityS3Destination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState13), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState25), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilitySentryDestinationMatches -> ObservabilityDestination.ObservabilitySentryDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState14), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState27), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilitySnowflakeDestinationMatches -> ObservabilityDestination.ObservabilitySnowflakeDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState15), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState29), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityWeaveDestinationMatches -> ObservabilityDestination.ObservabilityWeaveDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState16), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState31), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      matches.observabilityWebhookDestinationMatches -> ObservabilityDestination.ObservabilityWebhookDestination(apiKeyHashes = matches.apiKeyHashes, config = requireNotNull(matches.configState17), createdAt = requireNotNull(matches.createdAt), enabled = requireNotNull(matches.enabled), filterRules = matches.filterRules, id = requireNotNull(matches.id), name = matches.name, privacyMode = requireNotNull(matches.privacyMode), samplingRate = requireNotNull(matches.samplingRate), type = requireNotNull(matches.typeState33), updatedAt = requireNotNull(matches.updatedAt), workspaceId = requireNotNull(matches.workspaceId), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: ObservabilityDestination) {
    encoder.requireJsonEncoder("ObservabilityDestination").encodeJsonElement(value.raw)
  }
}

internal data class ObservabilityDestinationInspection(
  public val typeState1: InlineObservabilityArizeDestinationTypeXaa945fac?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val apiKeyHashes: List<String>?,
  public val apiKeyHashesPresent: Boolean,
  public val apiKeyHashesDecoded: Boolean,
  public val configState1: InlineObservabilityArizeDestinationConfigXfbccede6?,
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
  public val typeState2: InlineObservabilityArizeDestinationTypeXaa945fac?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val updatedAt: String?,
  public val updatedAtDecoded: Boolean,
  public val workspaceId: String?,
  public val workspaceIdDecoded: Boolean,
  public val typeState3: InlineObservabilityBraintrustDestinationTypeXdc9ebcbd?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val configState2: InlineObservabilityBraintrustDestinationConfigXca3254f1?,
  public val configState2Decoded: Boolean,
  public val typeState4: InlineObservabilityBraintrustDestinationTypeXdc9ebcbd?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState5: InlineObservabilityClickhouseDestinationTypeXab25c58f?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val configState3: InlineObservabilityClickhouseDestinationConfigXc10e4bca?,
  public val configState3Decoded: Boolean,
  public val typeState6: InlineObservabilityClickhouseDestinationTypeXab25c58f?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState7: InlineObservabilityDatadogDestinationTypeXaafd1c26?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val configState4: InlineObservabilityDatadogDestinationConfigX54fdef51?,
  public val configState4Decoded: Boolean,
  public val typeState8: InlineObservabilityDatadogDestinationTypeXaafd1c26?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val typeState9: InlineObservabilityGrafanaDestinationTypeXc4e6d71b?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val configState5: InlineObservabilityGrafanaDestinationConfigXfba37ac5?,
  public val configState5Decoded: Boolean,
  public val typeState10: InlineObservabilityGrafanaDestinationTypeXc4e6d71b?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val typeState11: InlineObservabilityLangfuseDestinationTypeXd56f0579?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val configState6: InlineObservabilityLangfuseDestinationConfigX61477ff1?,
  public val configState6Decoded: Boolean,
  public val typeState12: InlineObservabilityLangfuseDestinationTypeXd56f0579?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val typeState13: InlineObservabilityLangsmithDestinationTypeX509d5017?,
  public val typeState13Decoded: Boolean,
  public val typeState13Matches: Boolean,
  public val configState7: InlineObservabilityLangsmithDestinationConfigX8b295aef?,
  public val configState7Decoded: Boolean,
  public val typeState14: InlineObservabilityLangsmithDestinationTypeX509d5017?,
  public val typeState14Decoded: Boolean,
  public val typeState14Matches: Boolean,
  public val typeState15: InlineObservabilityNewrelicDestinationTypeX5f5ea9f0?,
  public val typeState15Decoded: Boolean,
  public val typeState15Matches: Boolean,
  public val configState8: InlineObservabilityNewrelicDestinationConfigX9a13614a?,
  public val configState8Decoded: Boolean,
  public val typeState16: InlineObservabilityNewrelicDestinationTypeX5f5ea9f0?,
  public val typeState16Decoded: Boolean,
  public val typeState16Matches: Boolean,
  public val typeState17: InlineObservabilityOpikDestinationTypeXf88b0504?,
  public val typeState17Decoded: Boolean,
  public val typeState17Matches: Boolean,
  public val configState9: InlineObservabilityOpikDestinationConfigX2c5bed62?,
  public val configState9Decoded: Boolean,
  public val typeState18: InlineObservabilityOpikDestinationTypeXf88b0504?,
  public val typeState18Decoded: Boolean,
  public val typeState18Matches: Boolean,
  public val typeState19: InlineObservabilityOtelCollectorDestinationTypeX374fb456?,
  public val typeState19Decoded: Boolean,
  public val typeState19Matches: Boolean,
  public val configState10: InlineObservabilityOtelCollectorDestinationConfigX25371089?,
  public val configState10Decoded: Boolean,
  public val typeState20: InlineObservabilityOtelCollectorDestinationTypeX374fb456?,
  public val typeState20Decoded: Boolean,
  public val typeState20Matches: Boolean,
  public val typeState21: InlineObservabilityPosthogDestinationTypeXecda09da?,
  public val typeState21Decoded: Boolean,
  public val typeState21Matches: Boolean,
  public val configState11: InlineObservabilityPosthogDestinationConfigX67c98908?,
  public val configState11Decoded: Boolean,
  public val typeState22: InlineObservabilityPosthogDestinationTypeXecda09da?,
  public val typeState22Decoded: Boolean,
  public val typeState22Matches: Boolean,
  public val typeState23: InlineObservabilityRampDestinationTypeX477e9e28?,
  public val typeState23Decoded: Boolean,
  public val typeState23Matches: Boolean,
  public val configState12: InlineObservabilityRampDestinationConfigX6c5677e2?,
  public val configState12Decoded: Boolean,
  public val typeState24: InlineObservabilityRampDestinationTypeX477e9e28?,
  public val typeState24Decoded: Boolean,
  public val typeState24Matches: Boolean,
  public val typeState25: InlineObservabilityS3DestinationTypeX9c0c7555?,
  public val typeState25Decoded: Boolean,
  public val typeState25Matches: Boolean,
  public val configState13: InlineObservabilityS3DestinationConfigX48a00451?,
  public val configState13Decoded: Boolean,
  public val typeState26: InlineObservabilityS3DestinationTypeX9c0c7555?,
  public val typeState26Decoded: Boolean,
  public val typeState26Matches: Boolean,
  public val typeState27: InlineObservabilitySentryDestinationTypeX111ec570?,
  public val typeState27Decoded: Boolean,
  public val typeState27Matches: Boolean,
  public val configState14: InlineObservabilitySentryDestinationConfigX9f3ba772?,
  public val configState14Decoded: Boolean,
  public val typeState28: InlineObservabilitySentryDestinationTypeX111ec570?,
  public val typeState28Decoded: Boolean,
  public val typeState28Matches: Boolean,
  public val typeState29: InlineObservabilitySnowflakeDestinationTypeXddfe0d50?,
  public val typeState29Decoded: Boolean,
  public val typeState29Matches: Boolean,
  public val configState15: InlineObservabilitySnowflakeDestinationConfigXd7bd4928?,
  public val configState15Decoded: Boolean,
  public val typeState30: InlineObservabilitySnowflakeDestinationTypeXddfe0d50?,
  public val typeState30Decoded: Boolean,
  public val typeState30Matches: Boolean,
  public val typeState31: InlineObservabilityWeaveDestinationTypeX7ef86b2d?,
  public val typeState31Decoded: Boolean,
  public val typeState31Matches: Boolean,
  public val configState16: InlineObservabilityWeaveDestinationConfigX6fab4547?,
  public val configState16Decoded: Boolean,
  public val typeState32: InlineObservabilityWeaveDestinationTypeX7ef86b2d?,
  public val typeState32Decoded: Boolean,
  public val typeState32Matches: Boolean,
  public val typeState33: InlineObservabilityWebhookDestinationTypeX8453f751?,
  public val typeState33Decoded: Boolean,
  public val typeState33Matches: Boolean,
  public val configState17: InlineObservabilityWebhookDestinationConfigXbcd5a650?,
  public val configState17Decoded: Boolean,
  public val typeState34: InlineObservabilityWebhookDestinationTypeX8453f751?,
  public val typeState34Decoded: Boolean,
  public val typeState34Matches: Boolean,
  public val observabilityArizeDestinationMatches: Boolean,
  public val observabilityBraintrustDestinationMatches: Boolean,
  public val observabilityClickhouseDestinationMatches: Boolean,
  public val observabilityDatadogDestinationMatches: Boolean,
  public val observabilityGrafanaDestinationMatches: Boolean,
  public val observabilityLangfuseDestinationMatches: Boolean,
  public val observabilityLangsmithDestinationMatches: Boolean,
  public val observabilityNewrelicDestinationMatches: Boolean,
  public val observabilityOpikDestinationMatches: Boolean,
  public val observabilityOtelCollectorDestinationMatches: Boolean,
  public val observabilityPosthogDestinationMatches: Boolean,
  public val observabilityRampDestinationMatches: Boolean,
  public val observabilityS3DestinationMatches: Boolean,
  public val observabilitySentryDestinationMatches: Boolean,
  public val observabilitySnowflakeDestinationMatches: Boolean,
  public val observabilityWeaveDestinationMatches: Boolean,
  public val observabilityWebhookDestinationMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (observabilityArizeDestinationMatches) add("ObservabilityArizeDestination")
      if (observabilityBraintrustDestinationMatches) add("ObservabilityBraintrustDestination")
      if (observabilityClickhouseDestinationMatches) add("ObservabilityClickhouseDestination")
      if (observabilityDatadogDestinationMatches) add("ObservabilityDatadogDestination")
      if (observabilityGrafanaDestinationMatches) add("ObservabilityGrafanaDestination")
      if (observabilityLangfuseDestinationMatches) add("ObservabilityLangfuseDestination")
      if (observabilityLangsmithDestinationMatches) add("ObservabilityLangsmithDestination")
      if (observabilityNewrelicDestinationMatches) add("ObservabilityNewrelicDestination")
      if (observabilityOpikDestinationMatches) add("ObservabilityOpikDestination")
      if (observabilityOtelCollectorDestinationMatches) add("ObservabilityOtelCollectorDestination")
      if (observabilityPosthogDestinationMatches) add("ObservabilityPosthogDestination")
      if (observabilityRampDestinationMatches) add("ObservabilityRampDestination")
      if (observabilityS3DestinationMatches) add("ObservabilityS3Destination")
      if (observabilitySentryDestinationMatches) add("ObservabilitySentryDestination")
      if (observabilitySnowflakeDestinationMatches) add("ObservabilitySnowflakeDestination")
      if (observabilityWeaveDestinationMatches) add("ObservabilityWeaveDestination")
      if (observabilityWebhookDestinationMatches) add("ObservabilityWebhookDestination")
    }

  public val size: Int
    get() = names.size
}

private fun inspectObservabilityDestination(rawObject: JsonObject): ObservabilityDestinationInspection {
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityArizeDestinationTypeXaa945fac>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "arize") && typeState1Decoded
  val apiKeyHashesResult = rawObject["api_key_hashes"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>?>(element) } }
  val apiKeyHashes = apiKeyHashesResult?.getOrNull()
  val apiKeyHashesPresent = rawObject.containsKey("api_key_hashes")
  val apiKeyHashesDecoded = apiKeyHashesResult?.isSuccess == true
  val configState1Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityArizeDestinationConfigXfbccede6>(element) } }
  val configState1 = configState1Result?.getOrNull()
  val configState1Decoded = configState1Result?.isSuccess == true
  val createdAtResult = rawObject["created_at"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val createdAt = createdAtResult?.getOrNull()
  val createdAtDecoded = createdAtResult?.isSuccess == true
  val enabledResult = rawObject["enabled"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Boolean>(element) } }
  val enabled = enabledResult?.getOrNull()
  val enabledDecoded = enabledResult?.isSuccess == true
  val filterRulesResult = rawObject["filter_rules"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ObservabilityFilterRulesConfig?>(element) } }
  val filterRules = filterRulesResult?.getOrNull()
  val filterRulesPresent = rawObject.containsKey("filter_rules")
  val filterRulesDecoded = filterRulesResult?.isSuccess == true
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val name = nameResult?.getOrNull()
  val namePresent = rawObject.containsKey("name")
  val nameDecoded = nameResult?.isSuccess == true
  val privacyModeResult = rawObject["privacy_mode"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Boolean>(element) } }
  val privacyMode = privacyModeResult?.getOrNull()
  val privacyModeDecoded = privacyModeResult?.isSuccess == true
  val samplingRateResult = rawObject["sampling_rate"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val samplingRate = samplingRateResult?.getOrNull()
  val samplingRateDecoded = samplingRateResult?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityArizeDestinationTypeXaa945fac>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "arize") && typeState2Decoded
  val updatedAtResult = rawObject["updated_at"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val updatedAt = updatedAtResult?.getOrNull()
  val updatedAtDecoded = updatedAtResult?.isSuccess == true
  val workspaceIdResult = rawObject["workspace_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val workspaceId = workspaceIdResult?.getOrNull()
  val workspaceIdDecoded = workspaceIdResult?.isSuccess == true
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityBraintrustDestinationTypeXdc9ebcbd>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "braintrust") && typeState3Decoded
  val configState2Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityBraintrustDestinationConfigXca3254f1>(element) } }
  val configState2 = configState2Result?.getOrNull()
  val configState2Decoded = configState2Result?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityBraintrustDestinationTypeXdc9ebcbd>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "braintrust") && typeState4Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityClickhouseDestinationTypeXab25c58f>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "clickhouse") && typeState5Decoded
  val configState3Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityClickhouseDestinationConfigXc10e4bca>(element) } }
  val configState3 = configState3Result?.getOrNull()
  val configState3Decoded = configState3Result?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityClickhouseDestinationTypeXab25c58f>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "clickhouse") && typeState6Decoded
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityDatadogDestinationTypeXaafd1c26>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "datadog") && typeState7Decoded
  val configState4Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityDatadogDestinationConfigX54fdef51>(element) } }
  val configState4 = configState4Result?.getOrNull()
  val configState4Decoded = configState4Result?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityDatadogDestinationTypeXaafd1c26>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "datadog") && typeState8Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityGrafanaDestinationTypeXc4e6d71b>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "grafana") && typeState9Decoded
  val configState5Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityGrafanaDestinationConfigXfba37ac5>(element) } }
  val configState5 = configState5Result?.getOrNull()
  val configState5Decoded = configState5Result?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityGrafanaDestinationTypeXc4e6d71b>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "grafana") && typeState10Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityLangfuseDestinationTypeXd56f0579>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "langfuse") && typeState11Decoded
  val configState6Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityLangfuseDestinationConfigX61477ff1>(element) } }
  val configState6 = configState6Result?.getOrNull()
  val configState6Decoded = configState6Result?.isSuccess == true
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityLangfuseDestinationTypeXd56f0579>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "langfuse") && typeState12Decoded
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityLangsmithDestinationTypeX509d5017>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "langsmith") && typeState13Decoded
  val configState7Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityLangsmithDestinationConfigX8b295aef>(element) } }
  val configState7 = configState7Result?.getOrNull()
  val configState7Decoded = configState7Result?.isSuccess == true
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityLangsmithDestinationTypeX509d5017>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "langsmith") && typeState14Decoded
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityNewrelicDestinationTypeX5f5ea9f0>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "newrelic") && typeState15Decoded
  val configState8Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityNewrelicDestinationConfigX9a13614a>(element) } }
  val configState8 = configState8Result?.getOrNull()
  val configState8Decoded = configState8Result?.isSuccess == true
  val typeState16Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityNewrelicDestinationTypeX5f5ea9f0>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = (rawObject.stringValue("type") == "newrelic") && typeState16Decoded
  val typeState17Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityOpikDestinationTypeXf88b0504>(element) } }
  val typeState17 = typeState17Result?.getOrNull()
  val typeState17Decoded = typeState17Result?.isSuccess == true
  val typeState17Matches = (rawObject.stringValue("type") == "opik") && typeState17Decoded
  val configState9Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityOpikDestinationConfigX2c5bed62>(element) } }
  val configState9 = configState9Result?.getOrNull()
  val configState9Decoded = configState9Result?.isSuccess == true
  val typeState18Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityOpikDestinationTypeXf88b0504>(element) } }
  val typeState18 = typeState18Result?.getOrNull()
  val typeState18Decoded = typeState18Result?.isSuccess == true
  val typeState18Matches = (rawObject.stringValue("type") == "opik") && typeState18Decoded
  val typeState19Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityOtelCollectorDestinationTypeX374fb456>(element) } }
  val typeState19 = typeState19Result?.getOrNull()
  val typeState19Decoded = typeState19Result?.isSuccess == true
  val typeState19Matches = (rawObject.stringValue("type") == "otel-collector") && typeState19Decoded
  val configState10Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityOtelCollectorDestinationConfigX25371089>(element) } }
  val configState10 = configState10Result?.getOrNull()
  val configState10Decoded = configState10Result?.isSuccess == true
  val typeState20Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityOtelCollectorDestinationTypeX374fb456>(element) } }
  val typeState20 = typeState20Result?.getOrNull()
  val typeState20Decoded = typeState20Result?.isSuccess == true
  val typeState20Matches = (rawObject.stringValue("type") == "otel-collector") && typeState20Decoded
  val typeState21Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityPosthogDestinationTypeXecda09da>(element) } }
  val typeState21 = typeState21Result?.getOrNull()
  val typeState21Decoded = typeState21Result?.isSuccess == true
  val typeState21Matches = (rawObject.stringValue("type") == "posthog") && typeState21Decoded
  val configState11Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityPosthogDestinationConfigX67c98908>(element) } }
  val configState11 = configState11Result?.getOrNull()
  val configState11Decoded = configState11Result?.isSuccess == true
  val typeState22Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityPosthogDestinationTypeXecda09da>(element) } }
  val typeState22 = typeState22Result?.getOrNull()
  val typeState22Decoded = typeState22Result?.isSuccess == true
  val typeState22Matches = (rawObject.stringValue("type") == "posthog") && typeState22Decoded
  val typeState23Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityRampDestinationTypeX477e9e28>(element) } }
  val typeState23 = typeState23Result?.getOrNull()
  val typeState23Decoded = typeState23Result?.isSuccess == true
  val typeState23Matches = (rawObject.stringValue("type") == "ramp") && typeState23Decoded
  val configState12Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityRampDestinationConfigX6c5677e2>(element) } }
  val configState12 = configState12Result?.getOrNull()
  val configState12Decoded = configState12Result?.isSuccess == true
  val typeState24Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityRampDestinationTypeX477e9e28>(element) } }
  val typeState24 = typeState24Result?.getOrNull()
  val typeState24Decoded = typeState24Result?.isSuccess == true
  val typeState24Matches = (rawObject.stringValue("type") == "ramp") && typeState24Decoded
  val typeState25Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityS3DestinationTypeX9c0c7555>(element) } }
  val typeState25 = typeState25Result?.getOrNull()
  val typeState25Decoded = typeState25Result?.isSuccess == true
  val typeState25Matches = (rawObject.stringValue("type") == "s3") && typeState25Decoded
  val configState13Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityS3DestinationConfigX48a00451>(element) } }
  val configState13 = configState13Result?.getOrNull()
  val configState13Decoded = configState13Result?.isSuccess == true
  val typeState26Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityS3DestinationTypeX9c0c7555>(element) } }
  val typeState26 = typeState26Result?.getOrNull()
  val typeState26Decoded = typeState26Result?.isSuccess == true
  val typeState26Matches = (rawObject.stringValue("type") == "s3") && typeState26Decoded
  val typeState27Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilitySentryDestinationTypeX111ec570>(element) } }
  val typeState27 = typeState27Result?.getOrNull()
  val typeState27Decoded = typeState27Result?.isSuccess == true
  val typeState27Matches = (rawObject.stringValue("type") == "sentry") && typeState27Decoded
  val configState14Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilitySentryDestinationConfigX9f3ba772>(element) } }
  val configState14 = configState14Result?.getOrNull()
  val configState14Decoded = configState14Result?.isSuccess == true
  val typeState28Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilitySentryDestinationTypeX111ec570>(element) } }
  val typeState28 = typeState28Result?.getOrNull()
  val typeState28Decoded = typeState28Result?.isSuccess == true
  val typeState28Matches = (rawObject.stringValue("type") == "sentry") && typeState28Decoded
  val typeState29Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilitySnowflakeDestinationTypeXddfe0d50>(element) } }
  val typeState29 = typeState29Result?.getOrNull()
  val typeState29Decoded = typeState29Result?.isSuccess == true
  val typeState29Matches = (rawObject.stringValue("type") == "snowflake") && typeState29Decoded
  val configState15Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilitySnowflakeDestinationConfigXd7bd4928>(element) } }
  val configState15 = configState15Result?.getOrNull()
  val configState15Decoded = configState15Result?.isSuccess == true
  val typeState30Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilitySnowflakeDestinationTypeXddfe0d50>(element) } }
  val typeState30 = typeState30Result?.getOrNull()
  val typeState30Decoded = typeState30Result?.isSuccess == true
  val typeState30Matches = (rawObject.stringValue("type") == "snowflake") && typeState30Decoded
  val typeState31Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityWeaveDestinationTypeX7ef86b2d>(element) } }
  val typeState31 = typeState31Result?.getOrNull()
  val typeState31Decoded = typeState31Result?.isSuccess == true
  val typeState31Matches = (rawObject.stringValue("type") == "weave") && typeState31Decoded
  val configState16Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityWeaveDestinationConfigX6fab4547>(element) } }
  val configState16 = configState16Result?.getOrNull()
  val configState16Decoded = configState16Result?.isSuccess == true
  val typeState32Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityWeaveDestinationTypeX7ef86b2d>(element) } }
  val typeState32 = typeState32Result?.getOrNull()
  val typeState32Decoded = typeState32Result?.isSuccess == true
  val typeState32Matches = (rawObject.stringValue("type") == "weave") && typeState32Decoded
  val typeState33Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityWebhookDestinationTypeX8453f751>(element) } }
  val typeState33 = typeState33Result?.getOrNull()
  val typeState33Decoded = typeState33Result?.isSuccess == true
  val typeState33Matches = (rawObject.stringValue("type") == "webhook") && typeState33Decoded
  val configState17Result = rawObject["config"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityWebhookDestinationConfigXbcd5a650>(element) } }
  val configState17 = configState17Result?.getOrNull()
  val configState17Decoded = configState17Result?.isSuccess == true
  val typeState34Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineObservabilityWebhookDestinationTypeX8453f751>(element) } }
  val typeState34 = typeState34Result?.getOrNull()
  val typeState34Decoded = typeState34Result?.isSuccess == true
  val typeState34Matches = (rawObject.stringValue("type") == "webhook") && typeState34Decoded
  val rawEmpty = rawObject.isEmpty()
  val observabilityArizeDestinationMatches = matchesObservabilityDestinationObservabilityArizeDestinationBranch(rawObject) && (typeState1Matches)
  val observabilityBraintrustDestinationMatches = matchesObservabilityDestinationObservabilityBraintrustDestinationBranch(rawObject) && (typeState3Matches)
  val observabilityClickhouseDestinationMatches = matchesObservabilityDestinationObservabilityClickhouseDestinationBranch(rawObject) && (typeState5Matches)
  val observabilityDatadogDestinationMatches = matchesObservabilityDestinationObservabilityDatadogDestinationBranch(rawObject) && (typeState7Matches)
  val observabilityGrafanaDestinationMatches = matchesObservabilityDestinationObservabilityGrafanaDestinationBranch(rawObject) && (typeState9Matches)
  val observabilityLangfuseDestinationMatches = matchesObservabilityDestinationObservabilityLangfuseDestinationBranch(rawObject) && (typeState11Matches)
  val observabilityLangsmithDestinationMatches = matchesObservabilityDestinationObservabilityLangsmithDestinationBranch(rawObject) && (typeState13Matches)
  val observabilityNewrelicDestinationMatches = matchesObservabilityDestinationObservabilityNewrelicDestinationBranch(rawObject) && (typeState15Matches)
  val observabilityOpikDestinationMatches = matchesObservabilityDestinationObservabilityOpikDestinationBranch(rawObject) && (typeState17Matches)
  val observabilityOtelCollectorDestinationMatches = matchesObservabilityDestinationObservabilityOtelCollectorDestinationBranch(rawObject) && (typeState19Matches)
  val observabilityPosthogDestinationMatches = matchesObservabilityDestinationObservabilityPosthogDestinationBranch(rawObject) && (typeState21Matches)
  val observabilityRampDestinationMatches = matchesObservabilityDestinationObservabilityRampDestinationBranch(rawObject) && (typeState23Matches)
  val observabilityS3DestinationMatches = matchesObservabilityDestinationObservabilityS3DestinationBranch(rawObject) && (typeState25Matches)
  val observabilitySentryDestinationMatches = matchesObservabilityDestinationObservabilitySentryDestinationBranch(rawObject) && (typeState27Matches)
  val observabilitySnowflakeDestinationMatches = matchesObservabilityDestinationObservabilitySnowflakeDestinationBranch(rawObject) && (typeState29Matches)
  val observabilityWeaveDestinationMatches = matchesObservabilityDestinationObservabilityWeaveDestinationBranch(rawObject) && (typeState31Matches)
  val observabilityWebhookDestinationMatches = matchesObservabilityDestinationObservabilityWebhookDestinationBranch(rawObject) && (typeState33Matches)
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
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    updatedAt = updatedAt,
    updatedAtDecoded = updatedAtDecoded,
    workspaceId = workspaceId,
    workspaceIdDecoded = workspaceIdDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    configState2 = configState2,
    configState2Decoded = configState2Decoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    configState3 = configState3,
    configState3Decoded = configState3Decoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    configState4 = configState4,
    configState4Decoded = configState4Decoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    configState5 = configState5,
    configState5Decoded = configState5Decoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    configState6 = configState6,
    configState6Decoded = configState6Decoded,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState13Matches = typeState13Matches,
    configState7 = configState7,
    configState7Decoded = configState7Decoded,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState14Matches = typeState14Matches,
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState15Matches = typeState15Matches,
    configState8 = configState8,
    configState8Decoded = configState8Decoded,
    typeState16 = typeState16,
    typeState16Decoded = typeState16Decoded,
    typeState16Matches = typeState16Matches,
    typeState17 = typeState17,
    typeState17Decoded = typeState17Decoded,
    typeState17Matches = typeState17Matches,
    configState9 = configState9,
    configState9Decoded = configState9Decoded,
    typeState18 = typeState18,
    typeState18Decoded = typeState18Decoded,
    typeState18Matches = typeState18Matches,
    typeState19 = typeState19,
    typeState19Decoded = typeState19Decoded,
    typeState19Matches = typeState19Matches,
    configState10 = configState10,
    configState10Decoded = configState10Decoded,
    typeState20 = typeState20,
    typeState20Decoded = typeState20Decoded,
    typeState20Matches = typeState20Matches,
    typeState21 = typeState21,
    typeState21Decoded = typeState21Decoded,
    typeState21Matches = typeState21Matches,
    configState11 = configState11,
    configState11Decoded = configState11Decoded,
    typeState22 = typeState22,
    typeState22Decoded = typeState22Decoded,
    typeState22Matches = typeState22Matches,
    typeState23 = typeState23,
    typeState23Decoded = typeState23Decoded,
    typeState23Matches = typeState23Matches,
    configState12 = configState12,
    configState12Decoded = configState12Decoded,
    typeState24 = typeState24,
    typeState24Decoded = typeState24Decoded,
    typeState24Matches = typeState24Matches,
    typeState25 = typeState25,
    typeState25Decoded = typeState25Decoded,
    typeState25Matches = typeState25Matches,
    configState13 = configState13,
    configState13Decoded = configState13Decoded,
    typeState26 = typeState26,
    typeState26Decoded = typeState26Decoded,
    typeState26Matches = typeState26Matches,
    typeState27 = typeState27,
    typeState27Decoded = typeState27Decoded,
    typeState27Matches = typeState27Matches,
    configState14 = configState14,
    configState14Decoded = configState14Decoded,
    typeState28 = typeState28,
    typeState28Decoded = typeState28Decoded,
    typeState28Matches = typeState28Matches,
    typeState29 = typeState29,
    typeState29Decoded = typeState29Decoded,
    typeState29Matches = typeState29Matches,
    configState15 = configState15,
    configState15Decoded = configState15Decoded,
    typeState30 = typeState30,
    typeState30Decoded = typeState30Decoded,
    typeState30Matches = typeState30Matches,
    typeState31 = typeState31,
    typeState31Decoded = typeState31Decoded,
    typeState31Matches = typeState31Matches,
    configState16 = configState16,
    configState16Decoded = configState16Decoded,
    typeState32 = typeState32,
    typeState32Decoded = typeState32Decoded,
    typeState32Matches = typeState32Matches,
    typeState33 = typeState33,
    typeState33Decoded = typeState33Decoded,
    typeState33Matches = typeState33Matches,
    configState17 = configState17,
    configState17Decoded = configState17Decoded,
    typeState34 = typeState34,
    typeState34Decoded = typeState34Decoded,
    typeState34Matches = typeState34Matches,
    observabilityArizeDestinationMatches = observabilityArizeDestinationMatches,
    observabilityBraintrustDestinationMatches = observabilityBraintrustDestinationMatches,
    observabilityClickhouseDestinationMatches = observabilityClickhouseDestinationMatches,
    observabilityDatadogDestinationMatches = observabilityDatadogDestinationMatches,
    observabilityGrafanaDestinationMatches = observabilityGrafanaDestinationMatches,
    observabilityLangfuseDestinationMatches = observabilityLangfuseDestinationMatches,
    observabilityLangsmithDestinationMatches = observabilityLangsmithDestinationMatches,
    observabilityNewrelicDestinationMatches = observabilityNewrelicDestinationMatches,
    observabilityOpikDestinationMatches = observabilityOpikDestinationMatches,
    observabilityOtelCollectorDestinationMatches = observabilityOtelCollectorDestinationMatches,
    observabilityPosthogDestinationMatches = observabilityPosthogDestinationMatches,
    observabilityRampDestinationMatches = observabilityRampDestinationMatches,
    observabilityS3DestinationMatches = observabilityS3DestinationMatches,
    observabilitySentryDestinationMatches = observabilitySentryDestinationMatches,
    observabilitySnowflakeDestinationMatches = observabilitySnowflakeDestinationMatches,
    observabilityWeaveDestinationMatches = observabilityWeaveDestinationMatches,
    observabilityWebhookDestinationMatches = observabilityWebhookDestinationMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!observabilityArizeDestinationMatches) add("ObservabilityArizeDestination: branch predicate did not match properties 'type'")
      if (!observabilityBraintrustDestinationMatches) add("ObservabilityBraintrustDestination: branch predicate did not match properties 'type'")
      if (!observabilityClickhouseDestinationMatches) add("ObservabilityClickhouseDestination: branch predicate did not match properties 'type'")
      if (!observabilityDatadogDestinationMatches) add("ObservabilityDatadogDestination: branch predicate did not match properties 'type'")
      if (!observabilityGrafanaDestinationMatches) add("ObservabilityGrafanaDestination: branch predicate did not match properties 'type'")
      if (!observabilityLangfuseDestinationMatches) add("ObservabilityLangfuseDestination: branch predicate did not match properties 'type'")
      if (!observabilityLangsmithDestinationMatches) add("ObservabilityLangsmithDestination: branch predicate did not match properties 'type'")
      if (!observabilityNewrelicDestinationMatches) add("ObservabilityNewrelicDestination: branch predicate did not match properties 'type'")
      if (!observabilityOpikDestinationMatches) add("ObservabilityOpikDestination: branch predicate did not match properties 'type'")
      if (!observabilityOtelCollectorDestinationMatches) add("ObservabilityOtelCollectorDestination: branch predicate did not match properties 'type'")
      if (!observabilityPosthogDestinationMatches) add("ObservabilityPosthogDestination: branch predicate did not match properties 'type'")
      if (!observabilityRampDestinationMatches) add("ObservabilityRampDestination: branch predicate did not match properties 'type'")
      if (!observabilityS3DestinationMatches) add("ObservabilityS3Destination: branch predicate did not match properties 'type'")
      if (!observabilitySentryDestinationMatches) add("ObservabilitySentryDestination: branch predicate did not match properties 'type'")
      if (!observabilitySnowflakeDestinationMatches) add("ObservabilitySnowflakeDestination: branch predicate did not match properties 'type'")
      if (!observabilityWeaveDestinationMatches) add("ObservabilityWeaveDestination: branch predicate did not match properties 'type'")
      if (!observabilityWebhookDestinationMatches) add("ObservabilityWebhookDestination: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesObservabilityDestinationObservabilityArizeDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityBraintrustDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityClickhouseDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityDatadogDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityGrafanaDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityLangfuseDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityLangsmithDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityNewrelicDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityOpikDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityOtelCollectorDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityPosthogDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityRampDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityS3DestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilitySentryDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilitySnowflakeDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityWeaveDestinationBranch(rawObject: JsonObject): Boolean = true

private fun matchesObservabilityDestinationObservabilityWebhookDestinationBranch(rawObject: JsonObject): Boolean = true

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
