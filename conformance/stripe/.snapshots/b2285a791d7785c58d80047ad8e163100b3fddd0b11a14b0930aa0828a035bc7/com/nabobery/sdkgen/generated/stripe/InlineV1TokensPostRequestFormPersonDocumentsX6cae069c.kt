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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDocumentsX6cae069c.Serializer::class)
public class InlineV1TokensPostRequestFormPersonDocumentsX6cae069c(
  public val companyAuthorization:
      InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f? = null,
  public val passport: InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54? = null,
  public val visa: InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608? = null,
) {
  public class Builder {
    public var companyAuthorization:
        InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f? = null

    public var passport: InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54? = null

    public var visa: InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608? = null

    public fun build(): InlineV1TokensPostRequestFormPersonDocumentsX6cae069c = InlineV1TokensPostRequestFormPersonDocumentsX6cae069c(
      companyAuthorization = companyAuthorization,
      passport = passport,
      visa = visa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonDocumentsX6cae069c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDocumentsX6cae069c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDocumentsX6cae069c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonDocumentsX6cae069c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonDocumentsX6cae069c must be a JSON object")
      return InlineV1TokensPostRequestFormPersonDocumentsX6cae069c(
        companyAuthorization = rawObject["company_authorization"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f>(it) },
        passport = rawObject["passport"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDocumentsPassportX09246e54>(it) },
        visa = rawObject["visa"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonDocumentsX6cae069c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonDocumentsX6cae069c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.companyAuthorization?.let { put("company_authorization", json.encodeToJsonElement(it)) }
        value.passport?.let { put("passport", json.encodeToJsonElement(it)) }
        value.visa?.let { put("visa", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonDocumentsX6cae069c(block: InlineV1TokensPostRequestFormPersonDocumentsX6cae069c.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonDocumentsX6cae069c = InlineV1TokensPostRequestFormPersonDocumentsX6cae069c.build(block)
