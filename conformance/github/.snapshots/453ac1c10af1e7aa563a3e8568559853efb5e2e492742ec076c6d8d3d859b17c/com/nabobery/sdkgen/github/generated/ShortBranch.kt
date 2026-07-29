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
 * Short Branch
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/short-branch
 */
@Serializable(with = ShortBranch.Serializer::class)
public class ShortBranch(
  public val commit: InlineShortBranchCommitXec74657e,
  public val name: String,
  public val `protected`: Boolean,
  public val protection: BranchProtection? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val protectionUrl: String? = null,
) {
  public class Builder {
    private var commitValue: InlineShortBranchCommitXec74657e? = null

    public var commit: InlineShortBranchCommitXec74657e
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

    public var protection: BranchProtection? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var protectionUrl: String? = null

    public fun build(): ShortBranch {
      check(commitValue != null) { "commit is required" }
      check(nameValue != null) { "name is required" }
      check(protectedValue != null) { "protected is required" }
      return ShortBranch(
        commit = commit,
        name = name,
        protected = protected,
        protection = protection,
        protectionUrl = protectionUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShortBranch = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ShortBranch> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShortBranch {
      val jsonDecoder = decoder.requireJsonDecoder("ShortBranch")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ShortBranch must be a JSON object")
      val commit = json.decodeRequired<InlineShortBranchCommitXec74657e>(rawObject, "commit")
      val name = json.decodeRequired<String>(rawObject, "name")
      val protected = json.decodeRequired<Boolean>(rawObject, "protected")
      return ShortBranch(
        commit = commit,
        name = name,
        protected = protected,
        protection = rawObject["protection"]?.let { json.decodeFromJsonElement<BranchProtection>(it) },
        protectionUrl = rawObject["protection_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShortBranch) {
      val jsonEncoder = encoder.requireJsonEncoder("ShortBranch")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit", json.encodeToJsonElement(value.commit))
        put("name", value.name)
        put("protected", json.encodeToJsonElement(value.protected))
        value.protection?.let { put("protection", json.encodeToJsonElement(it)) }
        value.protectionUrl?.let { put("protection_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shortBranch(block: ShortBranch.Builder.() -> Unit): ShortBranch = ShortBranch.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShortBranch is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
