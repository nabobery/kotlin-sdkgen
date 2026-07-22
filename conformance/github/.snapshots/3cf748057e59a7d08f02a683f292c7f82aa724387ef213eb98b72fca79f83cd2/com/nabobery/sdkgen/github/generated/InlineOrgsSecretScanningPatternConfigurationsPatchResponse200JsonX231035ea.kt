package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/responses/200/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/responses/200/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea.Serializer::class)
public class InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea(
  /**
   * The updated pattern configuration version.
   */
  public val patternConfigVersion: String? = null,
) {
  public class Builder {
    /**
     * The updated pattern configuration version.
     */
    public var patternConfigVersion: String? = null

    public fun build(): InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea = InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea(
      patternConfigVersion = patternConfigVersion,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea must be a JSON object")
      return InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea(
        patternConfigVersion = rawObject["pattern_config_version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.patternConfigVersion?.let { put("pattern_config_version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea(block: InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea.Builder.() -> Unit): InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea = InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea.build(block)
