package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PayoutsTraceIdView(
  public val status: String,
  public val `value`: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payouts_trace_id
 */
@Serializable(with = PayoutsTraceId.Serializer::class)
public class PayoutsTraceId(
  /**
   * Possible values are `pending`, `supported`, and `unsupported`. When `payout.status` is `pending` or `in_transit`,
   * this will be `pending`. When the payout transitions to `paid`, `failed`, or `canceled`, this status will become
   * `supported` or `unsupported` shortly after in most cases. In some cases, this may appear as `pending` for up to 10
   * days after `arrival_date` until transitioning to `supported` or `unsupported`.
   */
  public val status: String,
  /**
   * The trace ID value if `trace_id.status` is `supported`, otherwise `nil`.
   */
  public val `value`: String? = null,
) {
  public class Builder {
    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * The trace ID value if `trace_id.status` is `supported`, otherwise `nil`.
     */
    public var `value`: String? = null

    public fun build(): PayoutsTraceId {
      check(statusValue != null) { "status is required" }
      return PayoutsTraceId(
        status = status,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PayoutsTraceId = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PayoutsTraceId> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PayoutsTraceId {
      val jsonDecoder = decoder.requireJsonDecoder("PayoutsTraceId")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PayoutsTraceId must be a JSON object")
      val status = json.decodeRequired<String>(rawObject, "status")
      return PayoutsTraceId(
        status = status,
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PayoutsTraceId) {
      val jsonEncoder = encoder.requireJsonEncoder("PayoutsTraceId")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", value.status)
        value.value?.let { put("value", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun payoutsTraceId(block: PayoutsTraceId.Builder.() -> Unit): PayoutsTraceId = PayoutsTraceId.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PayoutsTraceId is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
