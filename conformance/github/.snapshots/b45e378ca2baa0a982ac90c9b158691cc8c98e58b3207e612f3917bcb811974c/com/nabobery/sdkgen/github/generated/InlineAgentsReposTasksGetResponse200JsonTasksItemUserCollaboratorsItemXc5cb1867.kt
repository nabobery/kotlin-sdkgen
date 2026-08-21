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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/user_collaborators/items
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867(
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

    public fun build(): InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867 = InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867 must be a JSON object")
      return InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867(block: InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867 = InlineAgentsReposTasksGetResponse200JsonTasksItemUserCollaboratorsItemXc5cb1867.build(block)
