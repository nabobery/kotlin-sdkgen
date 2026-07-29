package com.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_detail
 */
@Serializable(with = BalanceDetail.Serializer::class)
public class BalanceDetail(
  available: List<BalanceAmount>,
) {
  /**
   * Funds that are available for use.
   */
  public val available: List<BalanceAmount> = available.toList()

  public class Builder {
    private var availableValue: List<BalanceAmount>? = null

    public var available: List<BalanceAmount>
      get() = requireNotNull(availableValue) { "available is required" }.toList()
      set(`value`) {
        availableValue = value.toList()
      }

    public fun build(): BalanceDetail {
      check(availableValue != null) { "available is required" }
      return BalanceDetail(
        available = available,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceDetail = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BalanceDetail> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceDetail {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceDetail")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceDetail must be a JSON object")
      val available = json.decodeRequired<List<BalanceAmount>>(rawObject, "available")
      return BalanceDetail(
        available = available,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceDetail) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceDetail")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("available", json.encodeToJsonElement(value.available))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceDetail(block: BalanceDetail.Builder.() -> Unit): BalanceDetail = BalanceDetail.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BalanceDetail is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
