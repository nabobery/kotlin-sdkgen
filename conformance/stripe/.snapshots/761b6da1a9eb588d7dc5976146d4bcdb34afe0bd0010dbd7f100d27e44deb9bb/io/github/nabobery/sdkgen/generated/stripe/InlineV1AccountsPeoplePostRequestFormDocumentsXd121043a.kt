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
 * Documents that may be submitted to satisfy various informational requests.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a(
  public val companyAuthorization:
      InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9? = null,
  public val passport: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0? = null,
  public val visa: InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109? = null,
) {
  public class Builder {
    public var companyAuthorization:
        InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9? = null

    public var passport: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0? = null

    public var visa: InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a = InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a(
      companyAuthorization = companyAuthorization,
      passport = passport,
      visa = visa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a(
        companyAuthorization = rawObject["company_authorization"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9>(it) },
        passport = rawObject["passport"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0>(it) },
        visa = rawObject["visa"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a")
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

public fun inlineV1AccountsPeoplePostRequestFormDocumentsXd121043a(block: InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a = InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a.build(block)
