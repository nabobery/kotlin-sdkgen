package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/creator/oneOf/0
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c(
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

    public fun build(): InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c = InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c must be a JSON object")
      return InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c(block: InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c = InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorOneOf1X9b81c39c.build(block)
