package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Information about the current page.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1attestations~1bulk-list/post/responses/200/content/applicati
 * on~1json/schema/properties/page_info
 */
@Serializable(with = InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c.Serializer::class)
public class InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c(
  /**
   * Indicates whether there is a next page.
   */
  public val hasNext: Boolean? = null,
  /**
   * Indicates whether there is a previous page.
   */
  public val hasPrevious: Boolean? = null,
  /**
   * The cursor to the next page.
   */
  public val next: String? = null,
  /**
   * The cursor to the previous page.
   */
  public val previous: String? = null,
) {
  public class Builder {
    /**
     * Indicates whether there is a next page.
     */
    public var hasNext: Boolean? = null

    /**
     * Indicates whether there is a previous page.
     */
    public var hasPrevious: Boolean? = null

    /**
     * The cursor to the next page.
     */
    public var next: String? = null

    /**
     * The cursor to the previous page.
     */
    public var previous: String? = null

    public fun build(): InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c = InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c(
      hasNext = hasNext,
      hasPrevious = hasPrevious,
      next = next,
      previous = previous,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c must be a JSON object")
      return InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c(
        hasNext = rawObject["has_next"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasPrevious = rawObject["has_previous"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        next = rawObject["next"]?.let { json.decodeFromJsonElement<String>(it) },
        previous = rawObject["previous"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.hasNext?.let { put("has_next", json.encodeToJsonElement(it)) }
        value.hasPrevious?.let { put("has_previous", json.encodeToJsonElement(it)) }
        value.next?.let { put("next", it) }
        value.previous?.let { put("previous", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c(block: InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c.Builder.() -> Unit): InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c = InlineUsersAttestationsBulkListPostResponse200JsonPageInfoXadd2f15c.build(block)
