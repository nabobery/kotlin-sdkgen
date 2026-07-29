package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_physical_bundle_features
 */
@Serializable(with = IssuingPhysicalBundleFeatures.Serializer::class)
public class IssuingPhysicalBundleFeatures(
  /**
   * The policy for how to use card logo images in a card design with this physical bundle.
   */
  public val cardLogo: InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e,
  /**
   * The policy for how to use carrier letter text in a card design with this physical bundle.
   */
  public val carrierText: InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4,
  /**
   * The policy for how to use a second line on a card with this physical bundle.
   */
  public val secondLine: InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2,
) {
  public class Builder {
    private var cardLogoValue: InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e? = null

    public var cardLogo: InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e
      get() = requireNotNull(cardLogoValue) { "cardLogo is required" }
      set(`value`) {
        cardLogoValue = value
      }

    private var carrierTextValue: InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4? = null

    public var carrierText: InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4
      get() = requireNotNull(carrierTextValue) { "carrierText is required" }
      set(`value`) {
        carrierTextValue = value
      }

    private var secondLineValue: InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2? = null

    public var secondLine: InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2
      get() = requireNotNull(secondLineValue) { "secondLine is required" }
      set(`value`) {
        secondLineValue = value
      }

    public fun build(): IssuingPhysicalBundleFeatures {
      check(cardLogoValue != null) { "cardLogo is required" }
      check(carrierTextValue != null) { "carrierText is required" }
      check(secondLineValue != null) { "secondLine is required" }
      return IssuingPhysicalBundleFeatures(
        cardLogo = cardLogo,
        carrierText = carrierText,
        secondLine = secondLine,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingPhysicalBundleFeatures = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingPhysicalBundleFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingPhysicalBundleFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingPhysicalBundleFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingPhysicalBundleFeatures must be a JSON object")
      val cardLogo = json.decodeRequired<InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e>(rawObject, "card_logo")
      val carrierText = json.decodeRequired<InlineIssuingPhysicalBundleFeaturesCarrierTextXdf9185c4>(rawObject, "carrier_text")
      val secondLine = json.decodeRequired<InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2>(rawObject, "second_line")
      return IssuingPhysicalBundleFeatures(
        cardLogo = cardLogo,
        carrierText = carrierText,
        secondLine = secondLine,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingPhysicalBundleFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingPhysicalBundleFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("card_logo", json.encodeToJsonElement(value.cardLogo))
        put("carrier_text", json.encodeToJsonElement(value.carrierText))
        put("second_line", json.encodeToJsonElement(value.secondLine))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingPhysicalBundleFeatures(block: IssuingPhysicalBundleFeatures.Builder.() -> Unit): IssuingPhysicalBundleFeatures = IssuingPhysicalBundleFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingPhysicalBundleFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
