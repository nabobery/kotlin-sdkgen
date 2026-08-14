package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Merges must be performed via a merge queue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-merge-queue
 */
@Serializable(with = RepositoryRuleMergeQueue.Serializer::class)
public class RepositoryRuleMergeQueue(
  public val type: InlineRepositoryRuleMergeQueueTypeX172c173c,
  public val parameters: InlineRepositoryRuleMergeQueueParametersX27a258f9? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleMergeQueueTypeX172c173c? = null

    public var type: InlineRepositoryRuleMergeQueueTypeX172c173c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleMergeQueueParametersX27a258f9? = null

    public fun build(): RepositoryRuleMergeQueue {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleMergeQueue(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleMergeQueue = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleMergeQueue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleMergeQueue {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleMergeQueue")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleMergeQueue must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleMergeQueueTypeX172c173c>(rawObject, "type")
      return RepositoryRuleMergeQueue(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleMergeQueueParametersX27a258f9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleMergeQueue) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleMergeQueue")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleMergeQueue(block: RepositoryRuleMergeQueue.Builder.() -> Unit): RepositoryRuleMergeQueue = RepositoryRuleMergeQueue.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleMergeQueue is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
