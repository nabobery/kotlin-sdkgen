package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A collection of secret scanning patterns and their settings related to push protection.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-pattern-configuration
 */
@Serializable(with = SecretScanningPatternConfiguration.Serializer::class)
public class SecretScanningPatternConfiguration(
  customPatternOverrides: List<SecretScanningPatternOverride>? = null,
  public val patternConfigVersion: String? = null,
  providerPatternOverrides: List<SecretScanningPatternOverride>? = null,
) {
  /**
   * Overrides for custom patterns defined by the organization.
   */
  public val customPatternOverrides: List<SecretScanningPatternOverride>? =
      customPatternOverrides?.let { collection0 -> collection0.toList() }

  /**
   * Overrides for partner patterns.
   */
  public val providerPatternOverrides: List<SecretScanningPatternOverride>? =
      providerPatternOverrides?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var customPatternOverridesValue: List<SecretScanningPatternOverride>? = null

    /**
     * Overrides for custom patterns defined by the organization.
     */
    public var customPatternOverrides: List<SecretScanningPatternOverride>?
      get() = customPatternOverridesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customPatternOverridesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var patternConfigVersion: String? = null

    private var providerPatternOverridesValue: List<SecretScanningPatternOverride>? = null

    /**
     * Overrides for partner patterns.
     */
    public var providerPatternOverrides: List<SecretScanningPatternOverride>?
      get() = providerPatternOverridesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        providerPatternOverridesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): SecretScanningPatternConfiguration = SecretScanningPatternConfiguration(
      customPatternOverrides = customPatternOverrides,
      patternConfigVersion = patternConfigVersion,
      providerPatternOverrides = providerPatternOverrides,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningPatternConfiguration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningPatternConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningPatternConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningPatternConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningPatternConfiguration must be a JSON object")
      return SecretScanningPatternConfiguration(
        customPatternOverrides = rawObject["custom_pattern_overrides"]?.let { json.decodeFromJsonElement<List<SecretScanningPatternOverride>>(it) },
        patternConfigVersion = rawObject["pattern_config_version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        providerPatternOverrides = rawObject["provider_pattern_overrides"]?.let { json.decodeFromJsonElement<List<SecretScanningPatternOverride>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningPatternConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningPatternConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customPatternOverrides?.let { put("custom_pattern_overrides", json.encodeToJsonElement(it)) }
        value.patternConfigVersion?.let { put("pattern_config_version", it) }
        value.providerPatternOverrides?.let { put("provider_pattern_overrides", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningPatternConfiguration(block: SecretScanningPatternConfiguration.Builder.() -> Unit): SecretScanningPatternConfiguration = SecretScanningPatternConfiguration.build(block)
