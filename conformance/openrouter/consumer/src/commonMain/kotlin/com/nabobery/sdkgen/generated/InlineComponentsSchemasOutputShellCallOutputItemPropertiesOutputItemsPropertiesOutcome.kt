package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeDecodingException(message)

public class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeAmbiguityException(
  message: String,
) : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * .
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome
  .Serializer::class)
public sealed interface InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 internal constructor(
    public val exitCode: Int,
    public val type:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(exitCode: Int,
        type: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5 = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5(
        exitCode = exitCode,
        type = type,
        raw = buildJsonObject {
          put("exit_code", SdkJson.encodeToJsonElement(exitCode))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db internal constructor(
    public val type:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeNoMatchException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeNoMatchException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeAmbiguityException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.exitCodeDecoded && matches.typeState1Decoded ->
          InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5(exitCode =
            requireNotNull(matches.exitCode), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Decoded ->
          InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db(type =
            requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome")
          .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeInspection(
  public val exitCode: Int?,
  public val exitCodeDecoded: Boolean,
  public val typeState1:
      InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8?,
  public val typeState1Decoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234?,
  public val typeState2Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (exitCodeDecoded &&
        typeState1Decoded) add("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5")
      if (typeState2Decoded) add("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome(raw: JsonObject): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeInspection {
  val exitCodeResult = raw["exit_code"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val exitCode = exitCodeResult?.getOrNull()
  val exitCodeDecoded = exitCodeResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  return InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcomeInspection(
    exitCode = exitCode,
    exitCodeDecoded = exitCodeDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    failures = buildList {
      if (!exitCodeDecoded ||
        !typeState1Decoded) add("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO9e750db5: " +
          "required properties 'exit_code' and 'type' do not match their declared types")
      if (!typeState2Decoded) add("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO435324db: " +
        "required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
