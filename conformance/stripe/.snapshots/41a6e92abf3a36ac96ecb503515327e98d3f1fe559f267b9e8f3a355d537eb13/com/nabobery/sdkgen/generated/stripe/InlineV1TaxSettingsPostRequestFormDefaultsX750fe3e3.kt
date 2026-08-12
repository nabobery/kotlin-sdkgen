package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Default configuration to be used on Stripe Tax calculations.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1settings/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/defaults
 */
@Serializable(with = InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3.Serializer::class)
public class InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3(
  public val taxBehavior: InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4? = null,
  public val taxCode: String? = null,
) {
  public class Builder {
    public var taxBehavior: InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4? = null

    public var taxCode: String? = null

    public fun build(): InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3 = InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3(
      taxBehavior = taxBehavior,
      taxCode = taxCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3 must be a JSON object")
      return InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3(
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1TaxSettingsPostRequestFormDefaultsTaxBehaviorXe34cddd4>(it) },
        taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3(block: InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3.Builder.() -> Unit): InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3 = InlineV1TaxSettingsPostRequestFormDefaultsX750fe3e3.build(block)
