package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class BankConnectionsResourceTransactionRefreshView(
  public val id: String,
  @SerialName("last_attempted_at")
  public val lastAttemptedAt: Int,
  @SerialName("next_refresh_available_at")
  public val nextRefreshAvailableAt: Int? = null,
  public val status: InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_transaction_refresh
 */
@Serializable(with = BankConnectionsResourceTransactionRefresh.Serializer::class)
public class BankConnectionsResourceTransactionRefresh(
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The time at which the last refresh attempt was initiated. Measured in seconds since the Unix epoch.
   */
  public val lastAttemptedAt: Int,
  /**
   * The status of the last refresh attempt.
   */
  public val status: InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432,
  /**
   * Time at which the next transaction refresh can be initiated. This value will be `null` when `status` is `pending`.
   * Measured in seconds since the Unix epoch.
   */
  public val nextRefreshAvailableAt: Int? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var lastAttemptedAtValue: Int? = null

    public var lastAttemptedAt: Int
      get() = requireNotNull(lastAttemptedAtValue) { "lastAttemptedAt is required" }
      set(`value`) {
        lastAttemptedAtValue = value
      }

    private var statusValue: InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432? = null

    public var status: InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Time at which the next transaction refresh can be initiated. This value will be `null` when `status` is
     * `pending`. Measured in seconds since the Unix epoch.
     */
    public var nextRefreshAvailableAt: Int? = null

    public fun build(): BankConnectionsResourceTransactionRefresh {
      check(idValue != null) { "id is required" }
      check(lastAttemptedAtValue != null) { "lastAttemptedAt is required" }
      check(statusValue != null) { "status is required" }
      return BankConnectionsResourceTransactionRefresh(
        id = id,
        lastAttemptedAt = lastAttemptedAt,
        status = status,
        nextRefreshAvailableAt = nextRefreshAvailableAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceTransactionRefresh = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BankConnectionsResourceTransactionRefresh> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceTransactionRefresh {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceTransactionRefresh")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceTransactionRefresh must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val lastAttemptedAt = json.decodeRequired<Int>(rawObject, "last_attempted_at")
      val status = json.decodeRequired<InlineBankConnectionsResourceTransactionRefreshStatusX0b9d5432>(rawObject, "status")
      return BankConnectionsResourceTransactionRefresh(
        id = id,
        lastAttemptedAt = lastAttemptedAt,
        status = status,
        nextRefreshAvailableAt = rawObject["next_refresh_available_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceTransactionRefresh) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceTransactionRefresh")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("last_attempted_at", json.encodeToJsonElement(value.lastAttemptedAt))
        put("status", json.encodeToJsonElement(value.status))
        value.nextRefreshAvailableAt?.let { put("next_refresh_available_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceTransactionRefresh(block: BankConnectionsResourceTransactionRefresh.Builder.() -> Unit): BankConnectionsResourceTransactionRefresh = BankConnectionsResourceTransactionRefresh.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BankConnectionsResourceTransactionRefresh is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
