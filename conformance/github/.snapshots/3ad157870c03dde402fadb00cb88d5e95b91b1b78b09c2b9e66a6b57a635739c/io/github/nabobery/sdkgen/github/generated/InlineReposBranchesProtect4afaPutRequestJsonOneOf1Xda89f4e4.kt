package io.github.nabobery.sdkgen.github.generated

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
 * 1contexts/put/requestBody/content/application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_status_checks~
 * 1contexts/put/requestBody/content/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4.Serializer::class)
public class InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4(
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

    public fun build(): InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4 {
      check(contextsValue != null) { "contexts is required" }
      return InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4(
        contexts = contexts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4 must be a JSON object")
      val contexts = json.decodeRequired<List<String>>(rawObject, "contexts")
      return InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4(
        contexts = contexts,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("contexts", json.encodeToJsonElement(value.contexts))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4(block: InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4.Builder.() -> Unit): InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4 = InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtect4afaPutRequestJsonOneOf1Xda89f4e4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
