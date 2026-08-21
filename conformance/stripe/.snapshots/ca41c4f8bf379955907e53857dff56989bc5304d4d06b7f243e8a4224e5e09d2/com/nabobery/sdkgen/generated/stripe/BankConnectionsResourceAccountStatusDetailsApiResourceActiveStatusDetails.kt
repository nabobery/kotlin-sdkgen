package com.nabobery.sdkgen.generated.stripe

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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_status_details_api_resource_active
 * _status_details
 */
@Serializable(with = BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails.Serializer::class)
public class BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails(
  /**
   * The action (if any) to proactively relink the Account.
   */
  public val action: InlineBankConnectionsResouef23ActionXba32f22c,
  /**
   * The underlying cause of the Account becoming inactive.
   */
  public val cause: InlineBankConnectionsResouef23CauseXa67bbdf9,
  /**
   * When the Account is expected to become inactive, if applicable.
   */
  public val expectedDeactivationDate: Int,
) {
  public class Builder {
    private var actionValue: InlineBankConnectionsResouef23ActionXba32f22c? = null

    public var action: InlineBankConnectionsResouef23ActionXba32f22c
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var causeValue: InlineBankConnectionsResouef23CauseXa67bbdf9? = null

    public var cause: InlineBankConnectionsResouef23CauseXa67bbdf9
      get() = requireNotNull(causeValue) { "cause is required" }
      set(`value`) {
        causeValue = value
      }

    private var expectedDeactivationDateValue: Int? = null

    public var expectedDeactivationDate: Int
      get() = requireNotNull(expectedDeactivationDateValue) { "expectedDeactivationDate is required" }
      set(`value`) {
        expectedDeactivationDateValue = value
      }

    public fun build(): BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails {
      check(actionValue != null) { "action is required" }
      check(causeValue != null) { "cause is required" }
      check(expectedDeactivationDateValue != null) { "expectedDeactivationDate is required" }
      return BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails(
        action = action,
        cause = cause,
        expectedDeactivationDate = expectedDeactivationDate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails must be a JSON object")
      val action = json.decodeRequired<InlineBankConnectionsResouef23ActionXba32f22c>(rawObject, "action")
      val cause = json.decodeRequired<InlineBankConnectionsResouef23CauseXa67bbdf9>(rawObject, "cause")
      val expectedDeactivationDate = json.decodeRequired<Int>(rawObject, "expected_deactivation_date")
      return BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails(
        action = action,
        cause = cause,
        expectedDeactivationDate = expectedDeactivationDate,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("cause", json.encodeToJsonElement(value.cause))
        put("expected_deactivation_date", json.encodeToJsonElement(value.expectedDeactivationDate))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails(block: BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails.Builder.() -> Unit): BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails = BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BankConnectionsResourceAccountStatusDetailsApiResourceActiveStatusDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
