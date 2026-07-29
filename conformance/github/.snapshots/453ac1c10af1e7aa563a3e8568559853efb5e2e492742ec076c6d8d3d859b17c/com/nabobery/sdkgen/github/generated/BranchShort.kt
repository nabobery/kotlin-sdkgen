package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Branch Short
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-short
 */
@Serializable(with = BranchShort.Serializer::class)
public class BranchShort(
  public val commit: InlineBranchShortCommitX2be04c28,
  public val name: String,
  public val `protected`: Boolean,
) {
  public class Builder {
    private var commitValue: InlineBranchShortCommitX2be04c28? = null

    public var commit: InlineBranchShortCommitX2be04c28
      get() = requireNotNull(commitValue) { "commit is required" }
      set(`value`) {
        commitValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var protectedValue: Boolean? = null

    public var `protected`: Boolean
      get() = requireNotNull(protectedValue) { "protected is required" }
      set(`value`) {
        protectedValue = value
      }

    public fun build(): BranchShort {
      check(commitValue != null) { "commit is required" }
      check(nameValue != null) { "name is required" }
      check(protectedValue != null) { "protected is required" }
      return BranchShort(
        commit = commit,
        name = name,
        protected = protected,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BranchShort = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BranchShort> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BranchShort {
      val jsonDecoder = decoder.requireJsonDecoder("BranchShort")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BranchShort must be a JSON object")
      val commit = json.decodeRequired<InlineBranchShortCommitX2be04c28>(rawObject, "commit")
      val name = json.decodeRequired<String>(rawObject, "name")
      val protected = json.decodeRequired<Boolean>(rawObject, "protected")
      return BranchShort(
        commit = commit,
        name = name,
        protected = protected,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BranchShort) {
      val jsonEncoder = encoder.requireJsonEncoder("BranchShort")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit", json.encodeToJsonElement(value.commit))
        put("name", value.name)
        put("protected", json.encodeToJsonElement(value.protected))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun branchShort(block: BranchShort.Builder.() -> Unit): BranchShort = BranchShort.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BranchShort is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
