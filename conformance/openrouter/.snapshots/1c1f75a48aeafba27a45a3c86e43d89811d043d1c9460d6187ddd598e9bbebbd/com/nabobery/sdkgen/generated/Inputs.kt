package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InputsBranch {
  Branch1,
  Branch2,
}

public sealed class InputsDecodingException(
  message: String,
) : SerializationException(message)

public class InputsNoMatchException(
  message: String,
) : InputsDecodingException(message)

internal data class InputsInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Input for a response request - can be a string or array of items
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Inputs
 */
@Serializable(with = Inputs.Serializer::class)
public class Inputs internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InputsInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineInputsAnyOf2ItemXa13c7c4a>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineInputsAnyOf2ItemXa13c7c4a>>(raw) else null }

  public val matchedBranches: Set<InputsBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InputsBranch.Branch1)
      if (inspection.matchesBranch2) add(InputsBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): Inputs {
      val inspection = inspectInputs(raw)
      if (inspection.matchCount == 0) {
        throw InputsNoMatchException("Inputs matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return Inputs(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<Inputs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Inputs {
      val jsonDecoder = decoder.requireJsonDecoder("Inputs")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: Inputs) {
      encoder.requireJsonEncoder("Inputs").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInputs(element: JsonElement): InputsInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineInputsAnyOf2ItemXa13c7c4a>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InputsInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
