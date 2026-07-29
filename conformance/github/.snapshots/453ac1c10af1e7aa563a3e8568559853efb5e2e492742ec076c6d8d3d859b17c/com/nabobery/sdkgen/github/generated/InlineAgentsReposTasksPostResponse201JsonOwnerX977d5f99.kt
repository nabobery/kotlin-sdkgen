package com.nabobery.sdkgen.github.generated

import kotlin.Long
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
 * The owner of the repository
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/owner
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99.Serializer::class)
public class InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99(
  /**
   * The unique identifier of the user
   */
  public val id: Long? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the user
     */
    public var id: Long? = null

    public fun build(): InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99 = InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99 must be a JSON object")
      return InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99(block: InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99.Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99 = InlineAgentsReposTasksPostResponse201JsonOwnerX977d5f99.build(block)
