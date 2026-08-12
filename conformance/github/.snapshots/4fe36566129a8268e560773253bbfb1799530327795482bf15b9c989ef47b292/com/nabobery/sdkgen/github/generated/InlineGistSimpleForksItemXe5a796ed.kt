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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/gist-simple/properties/forks/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-simple/properties/forks/items
 */
@Serializable(with = InlineGistSimpleForksItemXe5a796ed.Serializer::class)
public class InlineGistSimpleForksItemXe5a796ed(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  public val id: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
  public val user: PublicUser? = null,
) {
  public class Builder {
    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    public var id: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public var user: PublicUser? = null

    public fun build(): InlineGistSimpleForksItemXe5a796ed = InlineGistSimpleForksItemXe5a796ed(
      createdAt = createdAt,
      id = id,
      updatedAt = updatedAt,
      url = url,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistSimpleForksItemXe5a796ed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGistSimpleForksItemXe5a796ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistSimpleForksItemXe5a796ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistSimpleForksItemXe5a796ed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistSimpleForksItemXe5a796ed must be a JSON object")
      return InlineGistSimpleForksItemXe5a796ed(
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<PublicUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistSimpleForksItemXe5a796ed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistSimpleForksItemXe5a796ed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.createdAt?.let { put("created_at", it) }
        value.id?.let { put("id", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistSimpleForksItemXe5a796ed(block: InlineGistSimpleForksItemXe5a796ed.Builder.() -> Unit): InlineGistSimpleForksItemXe5a796ed = InlineGistSimpleForksItemXe5a796ed.build(block)
