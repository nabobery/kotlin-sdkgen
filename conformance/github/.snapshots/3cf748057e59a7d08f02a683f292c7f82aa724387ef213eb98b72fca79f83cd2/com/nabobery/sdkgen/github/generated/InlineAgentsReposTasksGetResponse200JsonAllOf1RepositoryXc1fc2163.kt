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
 * The repository this task belongs to
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/repository
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163(
  /**
   * The unique identifier of the repository
   */
  public val id: Long? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the repository
     */
    public var id: Long? = null

    public fun build(): InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163 = InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163 must be a JSON object")
      return InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163(block: InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163 = InlineAgentsReposTasksGetResponse200JsonAllOf1RepositoryXc1fc2163.build(block)
