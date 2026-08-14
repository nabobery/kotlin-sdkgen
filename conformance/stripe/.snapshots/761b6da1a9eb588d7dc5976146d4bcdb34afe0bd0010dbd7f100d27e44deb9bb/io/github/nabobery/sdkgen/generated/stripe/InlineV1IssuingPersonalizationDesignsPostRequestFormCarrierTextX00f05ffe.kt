package io.github.nabobery.sdkgen.generated.stripe

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
 * Hash containing carrier text, for use with physical bundles that support carrier text.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/carrier_text
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe(
  public val footerBody:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX179e6ec0? = null,
  public val footerTitle:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8? = null,
  public val headerBody:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderBodyXde37ef95? = null,
  public val headerTitle:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderTitleX1fb512f6? = null,
) {
  public class Builder {
    public var footerBody:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX179e6ec0? = null

    public var footerTitle:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8? = null

    public var headerBody:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderBodyXde37ef95? = null

    public var headerTitle:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderTitleX1fb512f6? = null

    public fun build(): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe = InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe(
      footerBody = footerBody,
      footerTitle = footerTitle,
      headerBody = headerBody,
      headerTitle = headerTitle,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe must be a JSON object")
      return InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe(
        footerBody = rawObject["footer_body"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX179e6ec0>(it) },
        footerTitle = rawObject["footer_title"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8>(it) },
        headerBody = rawObject["header_body"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderBodyXde37ef95>(it) },
        headerTitle = rawObject["header_title"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderTitleX1fb512f6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.footerBody?.let { put("footer_body", json.encodeToJsonElement(it)) }
        value.footerTitle?.let { put("footer_title", json.encodeToJsonElement(it)) }
        value.headerBody?.let { put("header_body", json.encodeToJsonElement(it)) }
        value.headerTitle?.let { put("header_title", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe(block: InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe.Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe = InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX00f05ffe.build(block)
