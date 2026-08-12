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
 * oded/schema/properties/company/properties/ownership_declaration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/company/properties/ownership_declaration
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb(
  public val date: Int? = null,
  public val ip: String? = null,
  public val userAgent: String? = null,
) {
  public class Builder {
    public var date: Int? = null

    public var ip: String? = null

    public var userAgent: String? = null

    public fun build(): InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb = InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb must be a JSON object")
      return InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
        ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
        userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb")
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

public fun inlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb(block: InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb.Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb = InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationXe6b8c5eb.build(block)
