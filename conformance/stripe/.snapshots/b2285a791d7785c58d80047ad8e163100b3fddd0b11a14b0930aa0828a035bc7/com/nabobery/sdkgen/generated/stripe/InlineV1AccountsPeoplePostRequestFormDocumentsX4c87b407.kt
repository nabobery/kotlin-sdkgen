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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407(
  public val companyAuthorization:
      InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e? = null,
  public val passport: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d? = null,
  public val visa: InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912? = null,
) {
  public class Builder {
    public var companyAuthorization:
        InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e? = null

    public var passport: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d? = null

    public var visa: InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407 = InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407(
      companyAuthorization = companyAuthorization,
      passport = passport,
      visa = visa,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407(
        companyAuthorization = rawObject["company_authorization"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e>(it) },
        passport = rawObject["passport"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d>(it) },
        visa = rawObject["visa"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsVisaX84d9b912>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407")
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

public fun inlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407(block: InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407 = InlineV1AccountsPeoplePostRequestFormDocumentsX4c87b407.build(block)
