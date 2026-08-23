package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1{codespace_name}~1machines/get/responses/200/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1{codespace_name}~1machines/get/responses/200/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineUserCodespacesMachinesGetResponse200JsonXd25f7924.Serializer::class)
public class InlineUserCodespacesMachinesGetResponse200JsonXd25f7924(
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

    public fun build(): InlineUserCodespacesMachinesGetResponse200JsonXd25f7924 {
      check(machinesValue != null) { "machines is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineUserCodespacesMachinesGetResponse200JsonXd25f7924(
        machines = machines,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesMachinesGetResponse200JsonXd25f7924 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserCodespacesMachinesGetResponse200JsonXd25f7924> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesMachinesGetResponse200JsonXd25f7924 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesMachinesGetResponse200JsonXd25f7924")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesMachinesGetResponse200JsonXd25f7924 must be a JSON object")
      val machines = json.decodeRequired<List<CodespaceMachine>>(rawObject, "machines")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineUserCodespacesMachinesGetResponse200JsonXd25f7924(
        machines = machines,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesMachinesGetResponse200JsonXd25f7924) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesMachinesGetResponse200JsonXd25f7924")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("machines", json.encodeToJsonElement(value.machines))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesMachinesGetResponse200JsonXd25f7924(block: InlineUserCodespacesMachinesGetResponse200JsonXd25f7924.Builder.() -> Unit): InlineUserCodespacesMachinesGetResponse200JsonXd25f7924 = InlineUserCodespacesMachinesGetResponse200JsonXd25f7924.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesMachinesGetResponse200JsonXd25f7924 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
