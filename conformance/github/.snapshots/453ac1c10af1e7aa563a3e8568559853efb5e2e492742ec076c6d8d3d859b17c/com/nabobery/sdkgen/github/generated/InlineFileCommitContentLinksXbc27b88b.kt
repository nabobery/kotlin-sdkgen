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
 * sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/content/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/content/properties/_links
 */
@Serializable(with = InlineFileCommitContentLinksXbc27b88b.Serializer::class)
public class InlineFileCommitContentLinksXbc27b88b(
  public val git: String? = null,
  public val html: String? = null,
  public val self: String? = null,
) {
  public class Builder {
    public var git: String? = null

    public var html: String? = null

    public var self: String? = null

    public fun build(): InlineFileCommitContentLinksXbc27b88b = InlineFileCommitContentLinksXbc27b88b(
      git = git,
      html = html,
      self = self,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitContentLinksXbc27b88b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineFileCommitContentLinksXbc27b88b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitContentLinksXbc27b88b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitContentLinksXbc27b88b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitContentLinksXbc27b88b must be a JSON object")
      return InlineFileCommitContentLinksXbc27b88b(
        git = rawObject["git"]?.let { json.decodeFromJsonElement<String>(it) },
        html = rawObject["html"]?.let { json.decodeFromJsonElement<String>(it) },
        self = rawObject["self"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitContentLinksXbc27b88b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitContentLinksXbc27b88b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.git?.let { put("git", it) }
        value.html?.let { put("html", it) }
        value.self?.let { put("self", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFileCommitContentLinksXbc27b88b(block: InlineFileCommitContentLinksXbc27b88b.Builder.() -> Unit): InlineFileCommitContentLinksXbc27b88b = InlineFileCommitContentLinksXbc27b88b.build(block)
