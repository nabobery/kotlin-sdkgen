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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_detail_ungated
 */
@Serializable(with = BalanceDetailUngated.Serializer::class)
public class BalanceDetailUngated(
  available: List<BalanceAmount>,
  pending: List<BalanceAmount>,
) {
  /**
   * Funds that are available for use.
   */
  public val available: List<BalanceAmount> = available.toList()

  /**
   * Funds that are pending
   */
  public val pending: List<BalanceAmount> = pending.toList()

  public class Builder {
    private var availableValue: List<BalanceAmount>? = null

    public var available: List<BalanceAmount>
      get() = requireNotNull(availableValue) { "available is required" }.toList()
      set(`value`) {
        availableValue = value.toList()
      }

    private var pendingValue: List<BalanceAmount>? = null

    public var pending: List<BalanceAmount>
      get() = requireNotNull(pendingValue) { "pending is required" }.toList()
      set(`value`) {
        pendingValue = value.toList()
      }

    public fun build(): BalanceDetailUngated {
      check(availableValue != null) { "available is required" }
      check(pendingValue != null) { "pending is required" }
      return BalanceDetailUngated(
        available = available,
        pending = pending,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceDetailUngated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BalanceDetailUngated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceDetailUngated {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceDetailUngated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceDetailUngated must be a JSON object")
      val available = json.decodeRequired<List<BalanceAmount>>(rawObject, "available")
      val pending = json.decodeRequired<List<BalanceAmount>>(rawObject, "pending")
      return BalanceDetailUngated(
        available = available,
        pending = pending,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceDetailUngated) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceDetailUngated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("available", json.encodeToJsonElement(value.available))
        put("pending", json.encodeToJsonElement(value.pending))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceDetailUngated(block: BalanceDetailUngated.Builder.() -> Unit): BalanceDetailUngated = BalanceDetailUngated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BalanceDetailUngated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
