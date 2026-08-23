package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/tax_reporting_us_1099_misc.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/tax_reporting_us_1099_misc
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759 = InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759 must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759(block: InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759 = InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759.build(block)
