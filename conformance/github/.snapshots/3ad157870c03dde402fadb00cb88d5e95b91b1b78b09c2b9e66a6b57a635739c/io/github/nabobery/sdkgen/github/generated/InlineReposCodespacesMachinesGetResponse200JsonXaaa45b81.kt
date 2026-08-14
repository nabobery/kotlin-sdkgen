package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1machines/get/responses/200/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1machines/get/responses/200/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81.Serializer::class)
public class InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81(
  machines: List<CodespaceMachine>,
  public val totalCount: Int,
) {
  public val machines: List<CodespaceMachine> = machines.toList()

  public class Builder {
    private var machinesValue: List<CodespaceMachine>? = null

    public var machines: List<CodespaceMachine>
      get() = requireNotNull(machinesValue) { "machines is required" }.toList()
      set(`value`) {
        machinesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81 {
      check(machinesValue != null) { "machines is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81(
        machines = machines,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81 must be a JSON object")
      val machines = json.decodeRequired<List<CodespaceMachine>>(rawObject, "machines")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81(
        machines = machines,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("machines", json.encodeToJsonElement(value.machines))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCodespacesMachinesGetResponse200JsonXaaa45b81(block: InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81.Builder.() -> Unit): InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81 = InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
