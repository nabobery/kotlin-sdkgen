package com.nabobery.sdkgen.generated.stripe

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
 * The reason(s) the personalization design was rejected.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1personalization_designs~1{personalization_design}~1r
 * eject/post/requestBody/content/application~1x-www-form-urlencoded/schema/properties/rejection_reasons
 */
@Serializable(with = InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784.Serializer::class)
public class InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784(
  cardLogo: List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300>? = null,
  carrierText: List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXf006edac>? = null,
) {
  public val cardLogo:
      List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300>? =
      cardLogo?.let { collection0 -> collection0.toList() }

  public val carrierText:
      List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXf006edac>? =
      carrierText?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var cardLogoValue:
        List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300>? = null

    public var cardLogo:
        List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300>?
      get() = cardLogoValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        cardLogoValue = value?.let { collection0 -> collection0.toList() }
      }

    private var carrierTextValue:
        List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXf006edac>? = null

    public var carrierText:
        List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXf006edac>?
      get() = carrierTextValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        carrierTextValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784 = InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784(
      cardLogo = cardLogo,
      carrierText = carrierText,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784 must be a JSON object")
      return InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784(
        cardLogo = rawObject["card_logo"]?.let { json.decodeFromJsonElement<List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300>>(it) },
        carrierText = rawObject["carrier_text"]?.let { json.decodeFromJsonElement<List<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXf006edac>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardLogo?.let { put("card_logo", json.encodeToJsonElement(it)) }
        value.carrierText?.let { put("carrier_text", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784(block: InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784.Builder.() -> Unit): InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784 = InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784.build(block)
