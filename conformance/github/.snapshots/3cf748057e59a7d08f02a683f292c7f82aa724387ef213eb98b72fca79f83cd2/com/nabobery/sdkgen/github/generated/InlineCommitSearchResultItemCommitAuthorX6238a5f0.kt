package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/commit-search-result-item/properties/commit/properties/author.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/commit-search-result-item/properties/commit/properties/author
 */
@Serializable(with = InlineCommitSearchResultItemCommitAuthorX6238a5f0.Serializer::class)
public class InlineCommitSearchResultItemCommitAuthorX6238a5f0(
  public val date: String,
  public val email: String,
  public val name: String,
) {
  public class Builder {
    private var dateValue: String? = null

    public var date: String
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineCommitSearchResultItemCommitAuthorX6238a5f0 {
      check(dateValue != null) { "date is required" }
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineCommitSearchResultItemCommitAuthorX6238a5f0(
        date = date,
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommitSearchResultItemCommitAuthorX6238a5f0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCommitSearchResultItemCommitAuthorX6238a5f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommitSearchResultItemCommitAuthorX6238a5f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommitSearchResultItemCommitAuthorX6238a5f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommitSearchResultItemCommitAuthorX6238a5f0 must be a JSON object")
      val date = json.decodeRequired<String>(rawObject, "date")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineCommitSearchResultItemCommitAuthorX6238a5f0(
        date = date,
        email = email,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommitSearchResultItemCommitAuthorX6238a5f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommitSearchResultItemCommitAuthorX6238a5f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("date", value.date)
        put("email", value.email)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommitSearchResultItemCommitAuthorX6238a5f0(block: InlineCommitSearchResultItemCommitAuthorX6238a5f0.Builder.() -> Unit): InlineCommitSearchResultItemCommitAuthorX6238a5f0 = InlineCommitSearchResultItemCommitAuthorX6238a5f0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCommitSearchResultItemCommitAuthorX6238a5f0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
