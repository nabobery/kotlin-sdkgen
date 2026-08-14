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
 * The repository this task belongs to
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items/properties/repository
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290(
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

    public fun build(): InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290 = InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290(
      id = id,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290 must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290(block: InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290 = InlineAgentsTasksGetResponse200JsonTasksItemRepositoryXdd364290.build(block)
