package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/tipping/anyOf/0/properties/aed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/tipping/anyOf/0/properties/aed
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44(
  fixedAmounts: List<Int>? = null,
  percentages: List<Int>? = null,
  public val smartTipThreshold: Int? = null,
) {
  public val fixedAmounts: List<Int>? = fixedAmounts?.let { collection0 -> collection0.toList() }

  public val percentages: List<Int>? = percentages?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var fixedAmountsValue: List<Int>? = null

    public var fixedAmounts: List<Int>?
      get() = fixedAmountsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        fixedAmountsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var percentagesValue: List<Int>? = null

    public var percentages: List<Int>?
      get() = percentagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        percentagesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var smartTipThreshold: Int? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44 = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44(
      fixedAmounts = fixedAmounts,
      percentages = percentages,
      smartTipThreshold = smartTipThreshold,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44(
        fixedAmounts = rawObject["fixed_amounts"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        percentages = rawObject["percentages"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        smartTipThreshold = rawObject["smart_tip_threshold"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fixedAmounts?.let { put("fixed_amounts", json.encodeToJsonElement(it)) }
        value.percentages?.let { put("percentages", json.encodeToJsonElement(it)) }
        value.smartTipThreshold?.let { put("smart_tip_threshold", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44(block: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44 = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedX2aa35b44.build(block)
