package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/alma_installments
 */
@Serializable(with = AlmaInstallments.Serializer::class)
public class AlmaInstallments(
  /**
   * The number of installments.
   */
  public val count: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    public fun build(): AlmaInstallments {
      check(countValue != null) { "count is required" }
      return AlmaInstallments(
        count = count,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AlmaInstallments = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AlmaInstallments> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AlmaInstallments {
      val jsonDecoder = decoder.requireJsonDecoder("AlmaInstallments")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AlmaInstallments must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      return AlmaInstallments(
        count = count,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AlmaInstallments) {
      val jsonEncoder = encoder.requireJsonEncoder("AlmaInstallments")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun almaInstallments(block: AlmaInstallments.Builder.() -> Unit): AlmaInstallments = AlmaInstallments.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AlmaInstallments is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
