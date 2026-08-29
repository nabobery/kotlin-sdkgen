package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/carrier_text/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/carrier_text/anyOf/0
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041(
  public val footerBody:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb? = null,
  public val footerTitle:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleX04087b81? = null,
  public val headerBody:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderBodyX700b4c98? = null,
  public val headerTitle:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderTitleXbdca2615? = null,
) {
  public class Builder {
    public var footerBody:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb? = null

    public var footerTitle:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleX04087b81? = null

    public var headerBody:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderBodyX700b4c98? = null

    public var headerTitle:
        InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderTitleXbdca2615? = null

    public fun build(): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041 = InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041(
      footerBody = footerBody,
      footerTitle = footerTitle,
      headerBody = headerBody,
      headerTitle = headerTitle,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041 must be a JSON object")
      return InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041(
        footerBody = rawObject["footer_body"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterBodyX0eb767bb>(it) },
        footerTitle = rawObject["footer_title"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleX04087b81>(it) },
        headerBody = rawObject["header_body"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderBodyX700b4c98>(it) },
        headerTitle = rawObject["header_title"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextHeaderTitleXbdca2615>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041")
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

public fun inlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041(block: InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041.Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041 = InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextAnyOf1X4e9fa041.build(block)
