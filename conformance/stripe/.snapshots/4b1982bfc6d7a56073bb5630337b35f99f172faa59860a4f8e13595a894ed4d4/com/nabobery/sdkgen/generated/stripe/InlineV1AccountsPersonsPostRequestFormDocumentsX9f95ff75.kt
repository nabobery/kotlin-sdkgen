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
 * Documents that may be submitted to satisfy various informational requests.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75(
  public val companyAuthorization:
      InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912? = null,
  public val passport: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0? = null,
  public val visa: InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c? = null,
) {
  public class Builder {
    public var companyAuthorization:
        InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912? = null

    public var passport: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0? = null

    public var visa: InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75 = InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75(
      companyAuthorization = companyAuthorization,
      passport = passport,
      visa = visa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75 must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75(
        companyAuthorization = rawObject["company_authorization"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912>(it) },
        passport = rawObject["passport"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc400aba0>(it) },
        visa = rawObject["visa"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75")
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

public fun inlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75(block: InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75 = InlineV1AccountsPersonsPostRequestFormDocumentsX9f95ff75.build(block)
