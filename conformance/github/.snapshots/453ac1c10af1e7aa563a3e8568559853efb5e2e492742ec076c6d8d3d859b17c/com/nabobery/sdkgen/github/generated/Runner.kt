package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A self hosted runner
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/runner
 */
@Serializable(with = Runner.Serializer::class)
public class Runner(
  public val busy: Boolean,
  /**
   * The ID of the runner.
   */
  public val id: Int,
  labels: List<RunnerLabel>,
  /**
   * The name of the runner.
   */
  public val name: String,
  /**
   * The Operating System of the runner.
   */
  public val os: String,
  /**
   * The status of the runner.
   */
  public val status: String,
  public val ephemeral: Boolean? = null,
  /**
   * The ID of the runner group.
   */
  public val runnerGroupId: Int? = null,
  /**
   * The version of the GitHub Actions Runner software. This is only set if the runner has connected to the service at
   * least once.
   */
  public val version: String? = null,
) {
  public val labels: List<RunnerLabel> = labels.toList()

  public class Builder {
    private var busyValue: Boolean? = null

    public var busy: Boolean
      get() = requireNotNull(busyValue) { "busy is required" }
      set(`value`) {
        busyValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var labelsValue: List<RunnerLabel>? = null

    public var labels: List<RunnerLabel>
      get() = requireNotNull(labelsValue) { "labels is required" }.toList()
      set(`value`) {
        labelsValue = value.toList()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var osValue: String? = null

    public var os: String
      get() = requireNotNull(osValue) { "os is required" }
      set(`value`) {
        osValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public var ephemeral: Boolean? = null

    /**
     * The ID of the runner group.
     */
    public var runnerGroupId: Int? = null

    /**
     * The version of the GitHub Actions Runner software. This is only set if the runner has connected to the service at
     * least once.
     */
    public var version: String? = null

    public fun build(): Runner {
      check(busyValue != null) { "busy is required" }
      check(idValue != null) { "id is required" }
      check(labelsValue != null) { "labels is required" }
      check(nameValue != null) { "name is required" }
      check(osValue != null) { "os is required" }
      check(statusValue != null) { "status is required" }
      return Runner(
        busy = busy,
        id = id,
        labels = labels,
        name = name,
        os = os,
        status = status,
        ephemeral = ephemeral,
        runnerGroupId = runnerGroupId,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Runner = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Runner> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Runner {
      val jsonDecoder = decoder.requireJsonDecoder("Runner")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Runner must be a JSON object")
      val busy = json.decodeRequired<Boolean>(rawObject, "busy")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val labels = json.decodeRequired<List<RunnerLabel>>(rawObject, "labels")
      val name = json.decodeRequired<String>(rawObject, "name")
      val os = json.decodeRequired<String>(rawObject, "os")
      val status = json.decodeRequired<String>(rawObject, "status")
      return Runner(
        busy = busy,
        id = id,
        labels = labels,
        name = name,
        os = os,
        status = status,
        ephemeral = rawObject["ephemeral"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        runnerGroupId = rawObject["runner_group_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        version = rawObject["version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Runner) {
      val jsonEncoder = encoder.requireJsonEncoder("Runner")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("busy", json.encodeToJsonElement(value.busy))
        put("id", json.encodeToJsonElement(value.id))
        put("labels", json.encodeToJsonElement(value.labels))
        put("name", value.name)
        put("os", value.os)
        put("status", value.status)
        value.ephemeral?.let { put("ephemeral", json.encodeToJsonElement(it)) }
        value.runnerGroupId?.let { put("runner_group_id", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun runner(block: Runner.Builder.() -> Unit): Runner = Runner.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Runner is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
