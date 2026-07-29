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
 * A list of errors found in a repo's CODEOWNERS file
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codeowners-errors
 */
@Serializable(with = CodeownersErrors.Serializer::class)
public class CodeownersErrors(
  errors: List<InlineCodeownersErrorsErrorsItemXb48be3b1>,
) {
  public val errors: List<InlineCodeownersErrorsErrorsItemXb48be3b1> = errors.toList()

  public class Builder {
    private var errorsValue: List<InlineCodeownersErrorsErrorsItemXb48be3b1>? = null

    public var errors: List<InlineCodeownersErrorsErrorsItemXb48be3b1>
      get() = requireNotNull(errorsValue) { "errors is required" }.toList()
      set(`value`) {
        errorsValue = value.toList()
      }

    public fun build(): CodeownersErrors {
      check(errorsValue != null) { "errors is required" }
      return CodeownersErrors(
        errors = errors,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeownersErrors = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeownersErrors> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeownersErrors {
      val jsonDecoder = decoder.requireJsonDecoder("CodeownersErrors")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeownersErrors must be a JSON object")
      val errors = json.decodeRequired<List<InlineCodeownersErrorsErrorsItemXb48be3b1>>(rawObject, "errors")
      return CodeownersErrors(
        errors = errors,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeownersErrors) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeownersErrors")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("errors", json.encodeToJsonElement(value.errors))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeownersErrors(block: CodeownersErrors.Builder.() -> Unit): CodeownersErrors = CodeownersErrors.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeownersErrors is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
