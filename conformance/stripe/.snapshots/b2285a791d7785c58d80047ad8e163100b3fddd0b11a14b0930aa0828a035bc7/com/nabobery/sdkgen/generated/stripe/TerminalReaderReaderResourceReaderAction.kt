package com.nabobery.sdkgen.generated.stripe

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
public data class TerminalReaderReaderResourceReaderActionView(
  @SerialName("api_error")
  public val apiError: InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd? = null,
  @SerialName("collect_inputs")
  public val collectInputs: TerminalReaderReaderResourceCollectInputsAction? = null,
  @SerialName("collect_payment_method")
  public val collectPaymentMethod: TerminalReaderReaderResourceCollectPaymentMethodAction? = null,
  @SerialName("confirm_payment_intent")
  public val confirmPaymentIntent: TerminalReaderReaderResourceConfirmPaymentIntentAction? = null,
  @SerialName("failure_code")
  public val failureCode: String? = null,
  @SerialName("failure_message")
  public val failureMessage: String? = null,
  @SerialName("print_content")
  public val printContent: TerminalReaderReaderResourcePrintContent? = null,
  @SerialName("process_payment_intent")
  public val processPaymentIntent: TerminalReaderReaderResourceProcessPaymentIntentAction? = null,
  @SerialName("process_setup_intent")
  public val processSetupIntent: TerminalReaderReaderResourceProcessSetupIntentAction? = null,
  @SerialName("refund_payment")
  public val refundPayment: TerminalReaderReaderResourceRefundPaymentAction? = null,
  @SerialName("set_reader_display")
  public val setReaderDisplay: TerminalReaderReaderResourceSetReaderDisplayAction? = null,
  public val status: InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f,
  public val type: InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a,
)

/**
 * Represents an action performed by the reader
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_reader_action
 */
@Serializable(with = TerminalReaderReaderResourceReaderAction.Serializer::class)
public class TerminalReaderReaderResourceReaderAction(
  /**
   * Status of the action performed by the reader.
   */
  public val status: InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f,
  /**
   * Type of action performed by the reader.
   */
  public val type: InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a,
  /**
   * The reader action failed due to an [API error](https://docs.stripe.com/api/errors). Only present when `status` is
   * `failed` and the underlying failure was an API error. Avoid parsing the `message` field for programmatic logic; use
   * `type` or `code` instead. The `message` field is for display to humans only and may be updated at anytime. Requires
   * [reader version](https://docs.stripe.com/terminal/readers/stripe-reader-s700-s710#reader-software-version) 2.42 or
   * later. Readers on older versions always return null.
   */
  public val apiError: InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd? = null,
  public val collectInputs: TerminalReaderReaderResourceCollectInputsAction? = null,
  public val collectPaymentMethod: TerminalReaderReaderResourceCollectPaymentMethodAction? = null,
  public val confirmPaymentIntent: TerminalReaderReaderResourceConfirmPaymentIntentAction? = null,
  /**
   * Failure code, only set if status is `failed`.
   */
  public val failureCode: String? = null,
  /**
   * Detailed failure message, only set if status is `failed`.
   */
  public val failureMessage: String? = null,
  public val printContent: TerminalReaderReaderResourcePrintContent? = null,
  public val processPaymentIntent: TerminalReaderReaderResourceProcessPaymentIntentAction? = null,
  public val processSetupIntent: TerminalReaderReaderResourceProcessSetupIntentAction? = null,
  public val refundPayment: TerminalReaderReaderResourceRefundPaymentAction? = null,
  public val setReaderDisplay: TerminalReaderReaderResourceSetReaderDisplayAction? = null,
) {
  public class Builder {
    private var statusValue: InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f? = null

    public var status: InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a? = null

    public var type: InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The reader action failed due to an [API error](https://docs.stripe.com/api/errors). Only present when `status` is
     * `failed` and the underlying failure was an API error. Avoid parsing the `message` field for programmatic logic;
     * use `type` or `code` instead. The `message` field is for display to humans only and may be updated at anytime.
     * Requires [reader
     * version](https://docs.stripe.com/terminal/readers/stripe-reader-s700-s710#reader-software-version) 2.42 or later.
     * Readers on older versions always return null.
     */
    public var apiError: InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd? = null

    public var collectInputs: TerminalReaderReaderResourceCollectInputsAction? = null

    public var collectPaymentMethod: TerminalReaderReaderResourceCollectPaymentMethodAction? = null

    public var confirmPaymentIntent: TerminalReaderReaderResourceConfirmPaymentIntentAction? = null

    /**
     * Failure code, only set if status is `failed`.
     */
    public var failureCode: String? = null

    /**
     * Detailed failure message, only set if status is `failed`.
     */
    public var failureMessage: String? = null

    public var printContent: TerminalReaderReaderResourcePrintContent? = null

    public var processPaymentIntent: TerminalReaderReaderResourceProcessPaymentIntentAction? = null

    public var processSetupIntent: TerminalReaderReaderResourceProcessSetupIntentAction? = null

    public var refundPayment: TerminalReaderReaderResourceRefundPaymentAction? = null

    public var setReaderDisplay: TerminalReaderReaderResourceSetReaderDisplayAction? = null

    public fun build(): TerminalReaderReaderResourceReaderAction {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return TerminalReaderReaderResourceReaderAction(
        status = status,
        type = type,
        apiError = apiError,
        collectInputs = collectInputs,
        collectPaymentMethod = collectPaymentMethod,
        confirmPaymentIntent = confirmPaymentIntent,
        failureCode = failureCode,
        failureMessage = failureMessage,
        printContent = printContent,
        processPaymentIntent = processPaymentIntent,
        processSetupIntent = processSetupIntent,
        refundPayment = refundPayment,
        setReaderDisplay = setReaderDisplay,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceReaderAction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceReaderAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceReaderAction {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceReaderAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceReaderAction must be a JSON object")
      val status = json.decodeRequired<InlineTerminalReaderReaderResourceReaderActionStatusX32065a9f>(rawObject, "status")
      val type = json.decodeRequired<InlineTerminalReaderReaderResourceReaderActionTypeXdb26de8a>(rawObject, "type")
      return TerminalReaderReaderResourceReaderAction(
        status = status,
        type = type,
        apiError = rawObject["api_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTerminalReaderReaderResourceReaderActionApiErrorXadd9eadd?>(element) },
        collectInputs = rawObject["collect_inputs"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceCollectInputsAction>(it) },
        collectPaymentMethod = rawObject["collect_payment_method"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceCollectPaymentMethodAction>(it) },
        confirmPaymentIntent = rawObject["confirm_payment_intent"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceConfirmPaymentIntentAction>(it) },
        failureCode = rawObject["failure_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        failureMessage = rawObject["failure_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        printContent = rawObject["print_content"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourcePrintContent>(it) },
        processPaymentIntent = rawObject["process_payment_intent"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceProcessPaymentIntentAction>(it) },
        processSetupIntent = rawObject["process_setup_intent"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceProcessSetupIntentAction>(it) },
        refundPayment = rawObject["refund_payment"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceRefundPaymentAction>(it) },
        setReaderDisplay = rawObject["set_reader_display"]?.let { json.decodeFromJsonElement<TerminalReaderReaderResourceSetReaderDisplayAction>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceReaderAction) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceReaderAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.apiError?.let { put("api_error", json.encodeToJsonElement(it)) }
        value.collectInputs?.let { put("collect_inputs", json.encodeToJsonElement(it)) }
        value.collectPaymentMethod?.let { put("collect_payment_method", json.encodeToJsonElement(it)) }
        value.confirmPaymentIntent?.let { put("confirm_payment_intent", json.encodeToJsonElement(it)) }
        value.failureCode?.let { put("failure_code", it) }
        value.failureMessage?.let { put("failure_message", it) }
        value.printContent?.let { put("print_content", json.encodeToJsonElement(it)) }
        value.processPaymentIntent?.let { put("process_payment_intent", json.encodeToJsonElement(it)) }
        value.processSetupIntent?.let { put("process_setup_intent", json.encodeToJsonElement(it)) }
        value.refundPayment?.let { put("refund_payment", json.encodeToJsonElement(it)) }
        value.setReaderDisplay?.let { put("set_reader_display", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceReaderAction(block: TerminalReaderReaderResourceReaderAction.Builder.() -> Unit): TerminalReaderReaderResourceReaderAction = TerminalReaderReaderResourceReaderAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceReaderAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
