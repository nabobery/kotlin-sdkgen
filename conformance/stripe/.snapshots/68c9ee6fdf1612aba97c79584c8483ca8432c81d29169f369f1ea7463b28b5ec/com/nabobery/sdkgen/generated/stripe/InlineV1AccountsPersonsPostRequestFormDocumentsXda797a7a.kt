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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/documents
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a(
  public val companyAuthorization:
      InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX6b0cface? = null,
  public val passport: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f? = null,
  public val visa: InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3? = null,
) {
  public class Builder {
    public var companyAuthorization:
        InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX6b0cface? = null

    public var passport: InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f? = null

    public var visa: InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a = InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a(
      companyAuthorization = companyAuthorization,
      passport = passport,
      visa = visa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a(
        companyAuthorization = rawObject["company_authorization"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX6b0cface>(it) },
        passport = rawObject["passport"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsPassportXc3eba63f>(it) },
        visa = rawObject["visa"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsVisaXa6fe99c3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a")
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

public fun inlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a(block: InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a = InlineV1AccountsPersonsPostRequestFormDocumentsXda797a7a.build(block)
