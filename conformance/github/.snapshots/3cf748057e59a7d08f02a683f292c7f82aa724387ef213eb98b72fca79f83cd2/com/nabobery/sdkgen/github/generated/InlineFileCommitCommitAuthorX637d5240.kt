package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/author.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/author
 */
@Serializable(with = InlineFileCommitCommitAuthorX637d5240.Serializer::class)
public class InlineFileCommitCommitAuthorX637d5240(
  public val date: String? = null,
  public val email: String? = null,
  public val name: String? = null,
) {
  public class Builder {
    public var date: String? = null

    public var email: String? = null

    public var name: String? = null

    public fun build(): InlineFileCommitCommitAuthorX637d5240 = InlineFileCommitCommitAuthorX637d5240(
      date = date,
      email = email,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitCommitAuthorX637d5240 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineFileCommitCommitAuthorX637d5240> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitCommitAuthorX637d5240 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitCommitAuthorX637d5240")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitCommitAuthorX637d5240 must be a JSON object")
      return InlineFileCommitCommitAuthorX637d5240(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitCommitAuthorX637d5240) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitCommitAuthorX637d5240")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", it) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFileCommitCommitAuthorX637d5240(block: InlineFileCommitCommitAuthorX637d5240.Builder.() -> Unit): InlineFileCommitCommitAuthorX637d5240 = InlineFileCommitCommitAuthorX637d5240.build(block)
