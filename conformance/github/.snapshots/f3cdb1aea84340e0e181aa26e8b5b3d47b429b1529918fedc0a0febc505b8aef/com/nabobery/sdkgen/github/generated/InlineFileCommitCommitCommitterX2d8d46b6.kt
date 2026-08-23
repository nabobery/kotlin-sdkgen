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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/committer.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/committer
 */
@Serializable(with = InlineFileCommitCommitCommitterX2d8d46b6.Serializer::class)
public class InlineFileCommitCommitCommitterX2d8d46b6(
  public val date: String? = null,
  public val email: String? = null,
  public val name: String? = null,
) {
  public class Builder {
    public var date: String? = null

    public var email: String? = null

    public var name: String? = null

    public fun build(): InlineFileCommitCommitCommitterX2d8d46b6 = InlineFileCommitCommitCommitterX2d8d46b6(
      date = date,
      email = email,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitCommitCommitterX2d8d46b6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFileCommitCommitCommitterX2d8d46b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitCommitCommitterX2d8d46b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitCommitCommitterX2d8d46b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitCommitCommitterX2d8d46b6 must be a JSON object")
      return InlineFileCommitCommitCommitterX2d8d46b6(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitCommitCommitterX2d8d46b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitCommitCommitterX2d8d46b6")
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

public fun inlineFileCommitCommitCommitterX2d8d46b6(block: InlineFileCommitCommitCommitterX2d8d46b6.Builder.() -> Unit): InlineFileCommitCommitCommitterX2d8d46b6 = InlineFileCommitCommitCommitterX2d8d46b6.build(block)
