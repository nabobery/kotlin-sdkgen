package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_status_checks~
 * 1contexts/delete/requestBody/content/application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_status_checks~
 * 1contexts/delete/requestBody/content/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0.Serializer::class)
public class InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0(
  contexts: List<String>,
) {
  /**
   * The name of the status checks
   */
  public val contexts: List<String> = contexts.toList()

  public class Builder {
    private var contextsValue: List<String>? = null

    public var contexts: List<String>
      get() = requireNotNull(contextsValue) { "contexts is required" }.toList()
      set(`value`) {
        contextsValue = value.toList()
      }

    public fun build(): InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0 {
      check(contextsValue != null) { "contexts is required" }
      return InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0(
        contexts = contexts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0 must be a JSON object")
      val contexts = json.decodeRequired<List<String>>(rawObject, "contexts")
      return InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0(
        contexts = contexts,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("contexts", json.encodeToJsonElement(value.contexts))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0(block: InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0.Builder.() -> Unit): InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0 = InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtect4afaDeleteRequestJsonOneOf1X4db347f0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
