package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
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
 * oded/schema/properties/company/properties/representative_declaration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/representative_declaration
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e(
  public val date: Int? = null,
  public val ip: String? = null,
  public val userAgent: String? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var userAgent: String? = null

    public fun build(): InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e = InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e must be a JSON object")
      return InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e(block: InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e.Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e = InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationX7a4a6c1e.build(block)
