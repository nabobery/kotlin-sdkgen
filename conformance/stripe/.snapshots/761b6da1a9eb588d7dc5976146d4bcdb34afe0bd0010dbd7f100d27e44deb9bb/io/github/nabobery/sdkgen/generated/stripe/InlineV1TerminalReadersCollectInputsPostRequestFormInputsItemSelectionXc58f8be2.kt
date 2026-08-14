package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/selection.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/selection
 */
@Serializable(with = InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2.Serializer::class)
public class InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2(
  choices: List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065>,
) {
  public val choices:
      List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065> =
      choices.toList()

  public class Builder {
    private var choicesValue:
        List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065>? = null

    public var choices:
        List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065>
      get() = requireNotNull(choicesValue) { "choices is required" }.toList()
      set(`value`) {
        choicesValue = value.toList()
      }

    public fun build(): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2 {
      check(choicesValue != null) { "choices is required" }
      return InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2(
        choices = choices,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2 must be a JSON object")
      val choices = json.decodeRequired<List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionItemX6ee6b065>>(rawObject, "choices")
      return InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2(
        choices = choices,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("choices", json.encodeToJsonElement(value.choices))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2(block: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2.Builder.() -> Unit): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2 = InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
