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
 * A GitHub user
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/creator/oneOf/0
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548.Serializer::class)
public class InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548(
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

    public fun build(): InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548 = InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548 must be a JSON object")
      return InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548(block: InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548.Builder.() -> Unit): InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548 = InlineAgentsReposTasksPostResponse201JsonCreatorOneOf1Xaea57548.build(block)
