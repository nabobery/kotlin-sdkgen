package com.nabobery.sdkgen.github.generated

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
 * The status of auto merging a pull request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/auto-merge
 */
@Serializable(with = AutoMerge.Serializer::class)
public class AutoMerge(
  /**
   * Commit message for the merge commit.
   */
  public val commitMessage: String,
  /**
   * Title for the merge commit message.
   */
  public val commitTitle: String,
  public val enabledBy: SimpleUser,
  /**
   * The merge method to use.
   */
  public val mergeMethod: InlineAutoMergeMergeMethodX22377dd2,
) {
  public class Builder {
    private var commitMessageValue: String? = null

    public var commitMessage: String
      get() = requireNotNull(commitMessageValue) { "commitMessage is required" }
      set(`value`) {
        commitMessageValue = value
      }

    private var commitTitleValue: String? = null

    public var commitTitle: String
      get() = requireNotNull(commitTitleValue) { "commitTitle is required" }
      set(`value`) {
        commitTitleValue = value
      }

    private var enabledByValue: SimpleUser? = null

    public var enabledBy: SimpleUser
      get() = requireNotNull(enabledByValue) { "enabledBy is required" }
      set(`value`) {
        enabledByValue = value
      }

    private var mergeMethodValue: InlineAutoMergeMergeMethodX22377dd2? = null

    public var mergeMethod: InlineAutoMergeMergeMethodX22377dd2
      get() = requireNotNull(mergeMethodValue) { "mergeMethod is required" }
      set(`value`) {
        mergeMethodValue = value
      }

    public fun build(): AutoMerge {
      check(commitMessageValue != null) { "commitMessage is required" }
      check(commitTitleValue != null) { "commitTitle is required" }
      check(enabledByValue != null) { "enabledBy is required" }
      check(mergeMethodValue != null) { "mergeMethod is required" }
      return AutoMerge(
        commitMessage = commitMessage,
        commitTitle = commitTitle,
        enabledBy = enabledBy,
        mergeMethod = mergeMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AutoMerge = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AutoMerge> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AutoMerge {
      val jsonDecoder = decoder.requireJsonDecoder("AutoMerge")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AutoMerge must be a JSON object")
      val commitMessage = json.decodeRequired<String>(rawObject, "commit_message")
      val commitTitle = json.decodeRequired<String>(rawObject, "commit_title")
      val enabledBy = json.decodeRequired<SimpleUser>(rawObject, "enabled_by")
      val mergeMethod = json.decodeRequired<InlineAutoMergeMergeMethodX22377dd2>(rawObject, "merge_method")
      return AutoMerge(
        commitMessage = commitMessage,
        commitTitle = commitTitle,
        enabledBy = enabledBy,
        mergeMethod = mergeMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AutoMerge) {
      val jsonEncoder = encoder.requireJsonEncoder("AutoMerge")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit_message", value.commitMessage)
        put("commit_title", value.commitTitle)
        put("enabled_by", json.encodeToJsonElement(value.enabledBy))
        put("merge_method", json.encodeToJsonElement(value.mergeMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun autoMerge(block: AutoMerge.Builder.() -> Unit): AutoMerge = AutoMerge.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AutoMerge is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
