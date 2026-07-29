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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/verification
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04(
  public val document: InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd? = null,
) {
  public class Builder {
    public var document: InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd? = null

    public fun build(): InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04 = InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04(
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04 must be a JSON object")
      return InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04(
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCompanyVerificationXb377cb04(block: InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04.Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04 = InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04.build(block)
