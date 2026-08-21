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
 * A group of pull requests that the merge queue has grouped together to be merged.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/merge-group
 */
@Serializable(with = MergeGroup.Serializer::class)
public class MergeGroup(
  /**
   * The full ref of the branch the merge group will be merged into.
   */
  public val baseRef: String,
  /**
   * The SHA of the merge group's parent commit.
   */
  public val baseSha: String,
  public val headCommit: SimpleCommit,
  /**
   * The full ref of the merge group.
   */
  public val headRef: String,
  /**
   * The SHA of the merge group.
   */
  public val headSha: String,
) {
  public class Builder {
    private var baseRefValue: String? = null

    public var baseRef: String
      get() = requireNotNull(baseRefValue) { "baseRef is required" }
      set(`value`) {
        baseRefValue = value
      }

    private var baseShaValue: String? = null

    public var baseSha: String
      get() = requireNotNull(baseShaValue) { "baseSha is required" }
      set(`value`) {
        baseShaValue = value
      }

    private var headCommitValue: SimpleCommit? = null

    public var headCommit: SimpleCommit
      get() = requireNotNull(headCommitValue) { "headCommit is required" }
      set(`value`) {
        headCommitValue = value
      }

    private var headRefValue: String? = null

    public var headRef: String
      get() = requireNotNull(headRefValue) { "headRef is required" }
      set(`value`) {
        headRefValue = value
      }

    private var headShaValue: String? = null

    public var headSha: String
      get() = requireNotNull(headShaValue) { "headSha is required" }
      set(`value`) {
        headShaValue = value
      }

    public fun build(): MergeGroup {
      check(baseRefValue != null) { "baseRef is required" }
      check(baseShaValue != null) { "baseSha is required" }
      check(headCommitValue != null) { "headCommit is required" }
      check(headRefValue != null) { "headRef is required" }
      check(headShaValue != null) { "headSha is required" }
      return MergeGroup(
        baseRef = baseRef,
        baseSha = baseSha,
        headCommit = headCommit,
        headRef = headRef,
        headSha = headSha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MergeGroup = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MergeGroup> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MergeGroup {
      val jsonDecoder = decoder.requireJsonDecoder("MergeGroup")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MergeGroup must be a JSON object")
      val baseRef = json.decodeRequired<String>(rawObject, "base_ref")
      val baseSha = json.decodeRequired<String>(rawObject, "base_sha")
      val headCommit = json.decodeRequired<SimpleCommit>(rawObject, "head_commit")
      val headRef = json.decodeRequired<String>(rawObject, "head_ref")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      return MergeGroup(
        baseRef = baseRef,
        baseSha = baseSha,
        headCommit = headCommit,
        headRef = headRef,
        headSha = headSha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MergeGroup) {
      val jsonEncoder = encoder.requireJsonEncoder("MergeGroup")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("base_ref", value.baseRef)
        put("base_sha", value.baseSha)
        put("head_commit", json.encodeToJsonElement(value.headCommit))
        put("head_ref", value.headRef)
        put("head_sha", value.headSha)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mergeGroup(block: MergeGroup.Builder.() -> Unit): MergeGroup = MergeGroup.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MergeGroup is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
