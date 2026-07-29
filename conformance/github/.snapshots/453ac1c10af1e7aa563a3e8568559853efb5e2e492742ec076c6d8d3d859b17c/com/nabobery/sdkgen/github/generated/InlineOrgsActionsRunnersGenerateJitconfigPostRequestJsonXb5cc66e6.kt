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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners~1generate-jitconfig/post/requestBody/content/appl
 * ication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners~1generate-jitconfig/post/requestBody/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6.Serializer::class)
public class InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6(
  labels: List<String>,
  /**
   * The name of the new runner.
   */
  public val name: String,
  /**
   * The ID of the runner group to register the runner to.
   */
  public val runnerGroupId: Int,
  /**
   * The working directory to be used for job execution, relative to the runner install directory.
   */
  public val workFolder: String? = null,
) {
  /**
   * The names of the custom labels to add to the runner. **Minimum items**: 1. **Maximum items**: 100.
   */
  public val labels: List<String> = labels.toList()

  public class Builder {
    private var labelsValue: List<String>? = null

    public var labels: List<String>
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

    private var runnerGroupIdValue: Int? = null

    public var runnerGroupId: Int
      get() = requireNotNull(runnerGroupIdValue) { "runnerGroupId is required" }
      set(`value`) {
        runnerGroupIdValue = value
      }

    /**
     * The working directory to be used for job execution, relative to the runner install directory.
     */
    public var workFolder: String? = null

    public fun build(): InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6 {
      check(labelsValue != null) { "labels is required" }
      check(nameValue != null) { "name is required" }
      check(runnerGroupIdValue != null) { "runnerGroupId is required" }
      return InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6(
        labels = labels,
        name = name,
        runnerGroupId = runnerGroupId,
        workFolder = workFolder,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6 must be a JSON object")
      val labels = json.decodeRequired<List<String>>(rawObject, "labels")
      val name = json.decodeRequired<String>(rawObject, "name")
      val runnerGroupId = json.decodeRequired<Int>(rawObject, "runner_group_id")
      return InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6(
        labels = labels,
        name = name,
        runnerGroupId = runnerGroupId,
        workFolder = rawObject["work_folder"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("labels", json.encodeToJsonElement(value.labels))
        put("name", value.name)
        put("runner_group_id", json.encodeToJsonElement(value.runnerGroupId))
        value.workFolder?.let { put("work_folder", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6(block: InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6.Builder.() -> Unit): InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6 = InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnersGenerateJitconfigPostRequestJsonXb5cc66e6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
